public class CLIClassique {

	public static Configuration configuration(String... args) {
		Configuration config = new Configuration();
		boolean finOptions = false;
		int i = 0;
		while (i < args.length && ! finOptions) {
			String arg = args[i];
			System.out.println(arg);
			switch (arg) {
				case "-K": // Valeur de l'indice ÃƒÂ  calculer
					try {
						config.indice = Integer.parseInt(args[++i]);
					} catch (NumberFormatException e) {
						System.out.println(args[i] + " n'est pas au bon format. Veuillez rentrer un nombre entier.");
					}
					break;
				case "-E": // Valeur de la prÃƒÂ©cision ÃƒÂ  atteindre
					try {
						config.epsilon = Double.parseDouble(args[++i]);
					} catch (NumberFormatException e) {
						System.out.println(arg + " n'est pas au bon format. Veuillez rentrer un chiffre décimal.");
					}
					break;
				case "-A": // Valeur de alpha
					try {
						config.alpha = Double.parseDouble(args[++i]);
					} catch (NumberFormatException e) {
						System.out.println(arg + " n'est pas au bon format. Veuillez rentrer un chiffre décimal.");
					}
					break;
				case "-C": // Mode matrice creuse
					config.mode = Mode.CREUSE;
					break;
				case "-P": // Mode matrice pleine
					config.mode = Mode.PLEINE;
					break;
				default:
					finOptions = arg.length() == 0 || arg.charAt(0) != '-';
					if (! finOptions) {
						System.out.println("Option inconnue : " + arg);
					}
			}
			i++;
		}
		return config;
	}
}
