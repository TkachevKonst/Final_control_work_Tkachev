package Data;

import java.util.Date;

public class Hamster extends Pet{

    public Hamster() {};

    public Hamster(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }

    public String toString() {
        return String.format(
                "\n***\n %d %s - " +
                        "имя: %s -- " +
                        "дата рождения: %s -- " +
                        "комманды: ( %s )\n***", id, Hamster.class.getSimpleName(), name, birthday, commands.toString()
        );}
}
