package Model;

import Data.Animals;

import java.util.ArrayList;

public class AnimalsBox {
    ArrayList <Animals> box = new ArrayList<>();

    public void Addanimal(Animals animal){
        this.box.add(animal);
    }

    @Override
    public String toString() {
        for (Animals animal: box){
            String.format(String.valueOf(animal));
        }
        return String.format(box.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
    public Integer searchAnimal (String string){
        for(Animals animal : box)
        {
            if(animal.getName().toLowerCase().equals(string.toLowerCase()))
                return box.indexOf(animal);
        }
        return -1;

    }
}
