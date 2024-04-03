package Model;
import Data.*;
import Exception.*;
public class Functions {
    AnimalsBox box = new AnimalsBox();
    Write write = new Write();


    public boolean addAnimals(String string) throws NameException, DateException, CommandException{
        switch (string){
            case "dog":
                try {
                    Dog dog = new Dog(){};
                    write.InputName(dog);
                    write.InputBirth(dog);
                    write.InputCommands(dog);
                    box.Addanimal(dog);
                    try (AnimalCounter count = new AnimalCounter()) {
                        count.add();
                        count.writeId(dog);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } catch (NameException | DateException | CommandException e){
                    System.out.println(e.toString());
                }

                return false;
            case "cat":
                try {
                Cat cat = new Cat(){};
                write.InputName(cat);
                write.InputBirth(cat);
                write.InputCommands(cat);
                box.Addanimal(cat);
                try (AnimalCounter count = new AnimalCounter()) {
                    count.add();
                    count.writeId(cat);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }} catch (NameException | DateException | CommandException e){
                    System.out.println(e.toString());
                }
                return false;
            case "hamster":
                try {
                    Hamster hamster = new Hamster(){};
                write.InputName(hamster);
                write.InputBirth(hamster);
                write.InputCommands(hamster);
                box.Addanimal(hamster);
                try (AnimalCounter count = new AnimalCounter()) {
                    count.add();
                    count.writeId(hamster);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }} catch (NameException | DateException | CommandException e){
            System.out.println(e.toString());
        }
                return false;
            case "camel":
                try {
                Camel camel = new Camel(){};
                write.InputName(camel);
                write.InputBirth(camel);
                write.InputCommands(camel);
                box.Addanimal(camel);
                try (AnimalCounter count = new AnimalCounter()) {
                    count.add();
                    count.writeId(camel);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }} catch (NameException | DateException | CommandException e){
                    System.out.println(e.toString());
                }
                return false;
            case "horse":
                try {
                Horse horse = new Horse(){};
                write.InputName(horse);
                write.InputBirth(horse);
                write.InputCommands(horse);
                box.Addanimal(horse);
                try (AnimalCounter count = new AnimalCounter()) {
                    count.add();
                    count.writeId(horse);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }} catch (NameException | DateException | CommandException e){
            System.out.println(e.toString());
        }
                return false;
            case "donkey":
                try {
                Donkey donkey = new Donkey(){};
                write.InputName(donkey);
                write.InputBirth(donkey);
                write.InputCommands(donkey);
                box.Addanimal(donkey);
                try (AnimalCounter count = new AnimalCounter()) {
                    count.add();
                    count.writeId(donkey);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }} catch (NameException | DateException | CommandException e){
                    System.out.println(e.toString());
                }
                return false;
            default:
                return false;
        }
    }
    public void showAllCommand(){
        if (box.box.isEmpty()){
            System.out.println("Реестр пуст\n");
        }
        else for (Animals animals : box.box){
            System.out.println(String.format(animals.getName()) + " команды - " + animals.getCommands()+"\n");
        }
    }

    public void showCommand (){
            String string = write.InputName();
            Integer i = box.searchAnimal(string);
            System.out.println(String.format(box.box.get(i).getName() + " команды - " + box.box.get(i).getCommands()) + "\n");
    }

    public Integer showAnimals(){
        if (box.box.isEmpty()){
            System.out.println("Реестр пуст\n");
            return 0;
        }else System.out.println(box.toString());
        return 1;
    }
    public void addCommand () {
            String string = write.InputName();
            Integer i = box.searchAnimal(string);
            box.box.get(i).addNewCommand(write.InputCommands());
        }
}
