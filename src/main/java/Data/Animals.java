package Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public abstract class Animals {

    protected Integer id;
    protected String name;
    protected String birthday;

    protected ArrayList<String> commands;
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCommands(String commands) {
        this.commands = new ArrayList<> (Arrays.asList(commands.split("\\s*,\\s*")));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Animals(){
        this.name = "";
        this.birthday = "";
    };

    public Animals(String name, String bishtday, String commands) {
        this.name = name;
        this.birthday = bishtday;
        this.commands = new ArrayList<> (Arrays.asList(commands.split("\\s*,\\s*")));
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void addNewCommand (String[] command){
        this.commands.addAll(Arrays.asList(command));

    }



    @Override
    public String toString() {
        return String.format(
                "\n***\n %d %s - " +
                "имя: %s -- " +
                "дата рождения: %s -- " +
                "комманды: ( %s )\n***", id, Animals.class.getSimpleName(), name, birthday, commands.toString()
        );
    }
}
