package Model;

import Data.Animals;
import Exception.*;
import java.util.Scanner;

public class Write {

    Scanner scanner = new Scanner(System.in);

    private String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    private String prompt() {
        return scanner.nextLine();
    }

    public void InputName(Animals animal) {
        String s = prompt("Имя: ");
        NameException.NameCheck(s);
        animal.setName(s);
    }
    public String InputName() {
        String s = prompt("Имя: ");
        NameException.NameCheck(s);
        return s;
    }
    public void InputBirth(Animals animal) {
        String s = prompt("Дата рождения: ");
        DateException.DateCheck(s);
        animal.setBirthday(s);
    }
    public void InputCommands(Animals animal) {
        String s = prompt("Команды: ");
        CommandException.CommandCheck(s);
        animal.setCommands(s);
    }

    public String[] InputCommands() {
        String s = prompt("Команды: ");
        String[] strings = s.split(" ");
        CommandException.CommandCheck(s);
        return strings;
    }
    public String InputSearchName() {
        String s = prompt("Имя: ");
        NameException.NameCheck(s);
        return s;
    }

    public Integer InputInteger() {
        String s = prompt("Число: ");
        Integer i;
        try {
            i = Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println("Вы ввели не число");
            return -1; // посмотреть другое число
        }
        return i;
    }

}
