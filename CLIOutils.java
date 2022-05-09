import java.lang.reflect.Field;

public class CLIOutils {
    public static CLI fromClass(Object object){

        CLI cli = new CLI();
        // Récupération des propiétés
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field: fields) {

            String name = field.getName();
            String initial = String.valueOf(name.charAt(0));

            if (field.getType() == Boolean.class) {
                cli.addOption(new Option(initial, "Positionner " + name + " à vrai.", null));
                cli.addOption(new Option(initial.toUpperCase(), "Positionner " + name + " à Faux.", null));
            } else {
                cli.addOption(new Option(initial.toUpperCase(), "Valeur de " + name, null));
            }
        }

        return cli;
    }
}