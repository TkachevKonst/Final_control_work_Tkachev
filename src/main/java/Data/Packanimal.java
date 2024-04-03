package Data;

import java.util.Date;

public abstract class Packanimal extends Animals{

    public Packanimal(){
        this.name = "";
        this.birthday = "";
    };
    public Packanimal(String name, String bishtday, String commands) {
        super(name, bishtday, commands);
    }
}
