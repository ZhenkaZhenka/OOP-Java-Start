import Classes.*;

import java.util.ArrayList;

public class ProgramZoo {
    public static void main(String[] args){
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        getStartAnimals(zoo);
        prog(zoo);

    }

    public static void prog(ArrayList zoo){
        boolean marker = true;
        Integer command;
        while (marker){
            System.out.println("Вы попали в зоопарк, выберите действие:\n" +
                                "1. Добавить животное\n" +
                                "2. Удалить животное\n" +
                                "3. Посмотреть информацию о животном\n" +
                                "4. Заставить животное говорить(выдаст все секреты, на своем языке)\n" +
                                "5. Посмотреть информацию о всех животных в зоопарке\n" +
                                "6. Заставить всех животных говорить\n" +
                                "0. Чтоб остановить работу с зоопарком\n");
            command = Animal.getInteger("Введите номер действия\n");
            marker = startCommand(command, zoo, marker);
        }
        System.out.println("Хорошего дня! До свидания!");

    }

    static boolean startCommand(Integer command, ArrayList<Animal> zoo, boolean marker){
        switch (command){
            case 1:
                Zoo.addAnimal(zoo);
                return true;
            case 2:
                Zoo.removeAnimal(zoo);
                return true;
            case 3:
                System.out.println(zoo.get(Zoo.getIndex(zoo)).info() + "\n");
                return true;
            case 4:
                zoo.get(Zoo.getIndex(zoo)).voice();
                return true;
            case 5:
                Zoo.showAllAnimals(zoo);
                return true;
            case 6:
                Zoo.getVoiceAllAnimals(zoo);
                return true;
            case 0:
                return false;
            default:
                System.out.println("Такого действия нет\n");
                return true;
        }
    }

    public static void getStartAnimals(ArrayList<Animal> zoo){
        zoo.add(new Cat("Барсик", "Дворняга", true, "Рыжий", "--",
                true, 24.5F, 5.4F, "Зеленые"));
        zoo.add(new Dog("Барбос>", "Сиба-Ину", true, "Чёрный", "30.03.2010",
                true, 80.6F, 25.4F, "Серые"));
        zoo.add(new Tiger(100.4F, 13.9F, "Black",
                "Амурская область", "05.03.1980"));
        zoo.add(new Wolf(100.4F, 13.9F, "Black", "Япония"
                , "14.09.2000", true));
        zoo.add(new Chicken(25.4F, 3.0F, "Green", 4));
        zoo.add(new Stork(100.4F, 13.9F, "Black", 2000));
    }


}
