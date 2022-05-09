public class SetEpsilonAction implements Action {

    @Override
    public void execute(String value, Configuration configuration) {
        try {
            configuration.epsilon = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println(value + " n'est pas au bon format. Veuillez rentrer un chiffre décimal.");
        }
    }
    
}
