package Data;

import java.util.Date;

public class Horse extends Packanimal{

    public Horse() {};
    public Horse(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }

    public String toString() {
        return String.format(
                "\n***\n %d %s - " +
                        "имя: %s -- " +
                        "дата рождения: %s -- " +
                        "комманды: ( %s )\n***", id, Horse.class.getSimpleName(), name, birthday, commands.toString()
        );}
}
