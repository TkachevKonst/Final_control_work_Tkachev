package Data;

import java.util.Date;

public class Cat extends Pet{

    public Cat() {};
    public Cat(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }

    public String toString() {
        return String.format(
                "\n***\n %d %s - " +
                        "имя: %s -- " +
                        "дата рождения: %s -- " +
                        "комманды: ( %s )\n***", id, Cat.class.getSimpleName(), name, birthday, commands.toString()
        );}
}
