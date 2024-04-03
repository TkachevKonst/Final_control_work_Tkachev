package Data;

import java.util.Date;

public class Dog extends Pet{


    public Dog() {};
    public Dog(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }

    public String toString() {
        return String.format(
                "\n***\n %d %s - " +
                        "имя: %s -- " +
                        "дата рождения: %s -- " +
                        "комманды: ( %s )\n***",id, Dog.class.getSimpleName(), name, birthday, commands.toString()
        );}
}
