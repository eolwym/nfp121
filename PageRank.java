public class PageRank {
    public static void main(String... args) {
        Configuration configuration = new Configuration();
        CLI cli = new CLI();
        cli.addOption(new Option("-K", "Indice", new SetIndiceAction()));
        cli.addOption(new Option("-E", "Epsilon", new SetEpsilonAction()));
        cli.addOption(new Option("-A", "Alpha", new SetAlphaAction()));

        cli.handleArgs(args, configuration);
        System.out.println(configuration);
        
        // Test Swing
        CLIUserInterface cliUserInterface = new CLIUserInterface();
	}
}
