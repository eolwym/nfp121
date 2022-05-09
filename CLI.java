import java.util.HashMap;

public class CLI {
    HashMap<String, Option> options = new HashMap<>();

    public void addOption(Option option) {
       this.options.put(option.getOptionKey(), option);
    }

    public void handleArgs(String[] args, Configuration configuration) {
        for(int i=0; i<args.length-1; i++) {
            System.out.println(args[i]);
            Option option = options.get(args[i]);
            if (option != null) {
                option.getAction().execute(args[i+1], configuration);
            }
        }
    }

}
