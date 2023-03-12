package Classes;

import Interfaces.Petable;

public class Cat extends Pet implements Petable {

    boolean presenceOfWool;

    public Cat(String name, String breed, boolean injections,
               String color, String dateOfBirth, boolean presenceOfWool, Float height, Float weight, String colorOfEyes) {
        super(height, weight, colorOfEyes, name, breed, injections, color, dateOfBirth);
        this.presenceOfWool = presenceOfWool;
    }

    @Override
    public void love() {
        System.out.println("The " + name + " is trying to love you");
    }

    public boolean isPresenceOfWool() {
        return presenceOfWool;
    }

    private void setPresenceOfWool(boolean presenceOfWool) {
        this.presenceOfWool = presenceOfWool;
    }

    @Override
    public void voice() {
        System.out.println("Котик сказал МЯУ\n");
    }

    @Override
    public String info() {
        return "Cat: " +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", injections=" + injections +
                ", color='" + color + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", presenceOfWool=" + presenceOfWool;
    }
    public static Cat getCat(){
        return new Cat(getString("Введите имя котику: "),
                        getString("Введите породу котика: "),
                        getBoolean("Привит ли котик, введите true(да)/false(нет)"),
                        getString("Введите цвет котика:"),
                        getString("Введите дату рождения котика в формате дд/мм/гггг"),
                        getBoolean("Этот котик имеет шерсть? напишите true(да)/false(нет)"),
                        getFloat("Введите вес котика(десятичное число): "),
                        getFloat("Введите рост кота от пола до кончика ушей(десятичное число) в см: "),
                        getString("Введите цвет глаз котика: ")
                        );
    }
}