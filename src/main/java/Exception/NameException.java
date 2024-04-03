package Exception;

import java.util.ArrayList;
import java.util.Arrays;

public class NameException extends RuntimeException {
    public NameException() {
        super("Не корректно введено Имя");
    }

    public static void NameCheck(String s) {
        String string = s.toLowerCase();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                ".", "/", "|", ",", "?", "@", "!", "#", "&", "*", "+", "-", "'", ";", ":", "", " "));
        String[] strings = string.split(" ");
        if (strings.length != 1){
            throw new NameException();
        }
        for (String string1: strings) {
            String[] strings1 = string1.split("");
            for (String s1:strings1) {
                if (list.contains(s1)) {
                    throw new NameException();
                }
            }
        }

    }
}
