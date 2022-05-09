public class SetIndiceAction implements Action {

    @Override
    public void execute(String value, Configuration configuration) {
        try {
            configuration.indice = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println(value + " n'est pas au bon format. Veuillez rentrer un chiffre décimal.");
        }
    }
    
}
