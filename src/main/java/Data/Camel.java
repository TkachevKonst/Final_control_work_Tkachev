package Data;

import java.util.Date;

public class Camel extends Packanimal{

    public Camel() {};
    public Camel(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }

    public String toString() {
        return String.format(
                "\n***\n %d %s - " +
                        "имя: %s -- " +
                        "дата рождения: %s -- " +
                        "комманды: ( %s )\n***", id, Camel.class.getSimpleName(), name, birthday, commands.toString()
        );}
}
