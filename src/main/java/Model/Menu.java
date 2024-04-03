package Model;

public class Menu {
    Write write = new Write();
    Functions functions = new Functions();
    public void menu(){
        boolean b = true;
        while (b){
            b = menuBase();
        }
    }

    private boolean menuBase(){
        System.out.println("Введите номер операции согласно меню\n" +
                "1 - добавить животное\n" +
                "2 - посмотреть команды всех животных\n" +
                "3 - посмотреть команды одного животного\n" +
                "4 - добавить новую команду животному\n" +
                "5 - посмотреть весь список\n" +
                "6 - выход");
        Integer i = write.InputInteger();
        switch (i){
            case 1:
                int a = 1;
                while (a == 1) {
                    String string = menuAnimals();
                    if (string.isEmpty()) {
                        System.out.println("Команда не распознана.\n" +
                                "Попробуйте еще раз");
                    } else if (string.equals("exit")) {
                        a = 0;
                        } else {
                        System.out.println("Введите данные животных.\n" +
                                "Например:\n" +
                                "Имя Жучка \n" +
                                "Дата рождения: 12.12.2023 (Дату рождения вводить через точку)\n" +
                                "Команды: Сидеть Лежать (Команды вводить через пробел)");
                        functions.addAnimals(string);
                    System.out.println();}
                }return true;
            case 2:
                functions.showAllCommand();
                return true;
            case 3:
                Integer num = functions.showAnimals();
                if (num == 1){
                System.out.println("Выберите животное команды которого надо показать и напишите его кличку");
                functions.showCommand();}
                return true;
            case 4:
                Integer num1 = functions.showAnimals();
                if (num1 == 1){
                System.out.println("Выберите животное у которого надо добавить команду " +
                        "и напишите его кличку (можно написать одну или несколько) ");
                functions.addCommand();}
                return true;
            case 5:
                Integer i1 = functions.showAnimals();
                return true;
            case 6:
                System.out.println("До свидание");
                return false;
            default:
                System.out.println("Программа не распознана, попробуйте еще");
                return true;
        }
    }

    private String menuAnimals (){
        System.out.println("Выберите какое животное добавить в реестр\n" +
                "1 - Собака\n" +
                "2 - Кошка\n" +
                "3 - Хомяк\n" +
                "4 - Лошадь\n" +
                "5 - Верблюд\n" +
                "6 - Осел\n" +
                "7 - Выход");
        Integer i = write.InputInteger();
        switch (i){
            case 1:
                return "dog";
            case 2:
                return "cat";
            case 3:
                return "hamster";
            case 4:
                return "horse";
            case 5:
                return "camel";
            case 6:
                return "donkey";
            case 7:
                return "exit";
            default: return "";
        }
    }
    private boolean menuYesNo (){
        System.out.println("Вы уверены?\n" +
                "1 - Да\n" +
                "2 - Нет\n");
        Integer i = write.InputInteger();
        if(i==1){
            return true;
        }
        return true;
    }

}
