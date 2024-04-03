package Data;

import java.util.Date;

public class Donkey extends Packanimal{

    public Donkey(){};

    public Donkey(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }

    public String toString() {
        return String.format(
                "\n***\n %d %s - " +
                        "имя: %s -- " +
                        "дата рождения: %s -- " +
                        "комманды: ( %s )\n***", id, Donkey.class.getSimpleName(), name, birthday, commands.toString()
        );}
}
