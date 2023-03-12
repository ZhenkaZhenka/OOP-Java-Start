package Classes;

import java.util.ArrayList;

public class Zoo {
    public static void addAnimal(ArrayList zoo) {
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
                break;
            case 2:
                zoo.add(Dog.getDog());
                break;
            case 3:
                zoo.add(Tiger.getTiger());
                break;
            case 4:
                zoo.add(Wolf.getWolf());
                break;
            case 5:
                zoo.add(Chicken.getChicken());
                break;
            case 6:
                zoo.add(Stork.getStork());
                break;
            default:
                System.out.println("Такого животного в списке нет");
                break;
        }
    }

    public static void removeAnimal(ArrayList<Animal> zoo) {
        Integer index = getIndex(zoo);
        System.out.println(zoo.get(index).info() + " будет удалено\n");
        zoo.remove(index - 1);
    }

    public final static Integer getIndex(ArrayList zoo){
        int index = Animal.getInteger("Введите порядковый номер животного\n");
        try{
            if (index > 0 & index < zoo.size())
            return index - 1;
        } catch(Exception e){
            System.out.println("В зоопарке нет стакого животного\n");
            return getIndex(zoo);
        }
        System.out.println("В зоопарке нет стакого животного\n");
        return getIndex(zoo);
    }

    public static void showAllAnimals(ArrayList<Animal> zoo){
        for (Animal animal : zoo) System.out.println(animal.info() + "\n");
    }

    public static void getVoiceAllAnimals(ArrayList<Animal> zoo){
        for (Animal animal : zoo) animal.voice();
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
