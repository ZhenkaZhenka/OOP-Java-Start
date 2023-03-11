package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static ArrayList<Animal> zoo;

    public void addAnimal(ArrayList zoo) {
        System.out.println("Какое животное вы хотите добавить:\n" +
                "1. Кот\n" +
                "2. Собака\n" +
                "3. Тигр\n" +
                "4. Волк\n" +
                "5. Курица\n" +
                "6. Аист\n");
        Integer number = Animal.getInteger("Введите число: ");
        switch (number) {
            case 1:
                zoo.add(Cat.getCat());
            case 2:
                zoo.add(Dog.getDog());
            case 3:
                zoo.add(Tiger.getTiger());
            case 4:
                zoo.add(Wolf.getWolf());
            case 5:
                zoo.add(Chicken.getChicken());
            case 6:
                zoo.add(Stork.getStork());
            default:
                System.out.println("Такого животного в списке нет");
        }
    }

    public void removeAnimal(ArrayList zoo) {
        Integer index = Animal.getInteger("Введите порядковый номер ивотного для удаления");
        System.out.println("Животное будет удалено");
        zoo.remove(index - 1);
    }

    public void showInfo(Animal animal) {
        animal.info();
    }

    public void getVoice(Animal animal) {
        animal.voice();
    }

    public void getVoiceOfAllAnimal() {
        for (Animal animal : zoo) {
            animal.voice();
        }
    }

    public void makeFly(Birds bird) {
        bird.fly();
    }

    public void makeLove(Cat cat) {
        cat.love();

    }

    public void makeTraining(Dog dog) {
        dog.training();
    }

}
