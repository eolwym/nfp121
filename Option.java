public class Option {
    private String optionKey;
    private String description;
    private Action action;

    public Option(String optionKey, String description, Action action) {
        this.optionKey = optionKey;
        this.description = description;
        this.action = action;
    }

    public String getOptionKey() {
        return this.optionKey;
    }

    public Action getAction() {
        return this.action;
    }
}
