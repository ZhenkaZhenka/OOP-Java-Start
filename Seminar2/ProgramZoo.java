import Classes.*;

import java.util.ArrayList;

public class ProgramZoo {
    public static void main(String[] args){
        ArrayList<Animal> zoo = Zoo.zoo;
        getStartAnimals(zoo);

    }

    void showAllAnimals(ArrayList<Animal> zoo){
        for (Animal animal : zoo) animal.info();
    }

    public static void getStartAnimals(ArrayList zoo){
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
