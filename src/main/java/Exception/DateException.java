package Exception;

public class DateException extends RuntimeException {
    public DateException() {
        super("Некорректная дата");
    }

    public static void DateCheck(String s) {
        String[] strings = s.split("\\.");
        if (strings.length != 3)
            throw new DateException();
        if(strings[0].length() != 2 || strings[1].length() != 2 || strings[2].length() != 4)
            throw new DateException();
        for (String string: strings) {
            try {
                int a = Integer.parseInt(string);
            }catch (NumberFormatException e){
                throw new DateException();
            }
        }
        int d = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int y = Integer.parseInt(strings[2]);
        if(m < 1 || m > 12)
            throw new DateException();
        if(1990 > y || y > 2023)
            throw new DateException();
        if(1 > d || d > 31)
            throw new DateException();

    }
}
