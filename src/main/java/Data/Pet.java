package Data;

import java.util.Date;

public abstract class Pet extends Animals {

    public Pet(){
        this.name = "";
        this.birthday = "";
    };
    public Pet(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }
}
