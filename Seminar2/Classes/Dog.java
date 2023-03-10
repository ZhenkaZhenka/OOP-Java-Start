package Classes;

public class Dog extends Pet{
    boolean trainable;

    public Dog(String name, String breed, boolean injections, String color, String dateOfBirth, boolean trainable,
               Float height, Float weight, String colorOfEyes) {
        super(height, weight, colorOfEyes, name, breed, injections, color, dateOfBirth);
        this.trainable = trainable;
    }

    public boolean isTrainable() {
        return trainable;
    }

    private void setTrainable(boolean trainable) {
        this.trainable = trainable;
    }

    public void training(){
        System.out.println("Now your dog can do back-flip");
    }

    @Override
    void voice() {
        System.out.println("Гав-гав");
    }

    @Override
    public String info() {
        return "Dog" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", injections=" + injections +
                ", color='" + color + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", trainable=" + trainable;
    }

    public Dog getDog() {
        return new Dog(getString("Введите имя пёселя: "),
                        getString("Введите породу пёселя: "),
                        getBoolean("Привит ли пёсель, введите true(да)/false(нет)"),
                        getString("Введите цвет пёселя:"),
                        getString("Введите дату рождения пёселя в формате дд/мм/гггг"),
                        getBoolean("Этот пёсель поддается дрессировке? напишите true(да)/false(нет)"),
                        getFloat("Введите вес котика(десятичное число): "),
                        getFloat("Введите рост кота от пола до кончика ушей(десятичное число): "),
                        getString("Введите цвет глаз котика: ")
                        );
    }
}
