package Classes;

public class Chicken extends Birds{
    public Chicken(Float height, Float weight, String colorOfEyes, Integer heightOfFlight) {
        super(height, weight, colorOfEyes, heightOfFlight);
    }

    @Override
    public void voice() {
        System.out.println("Ко-ко-ко\n");
    }

    @Override
    public String info() {
        return "Chicken: " +
                "height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", heightOfFlight=" + heightOfFlight;
    }

     public void fly(){
        System.out.println("Курица летит на высоте " +  heightOfFlight + " m");
    }

    public static Chicken getChicken(){
        return new Chicken(getFloat("Введите рост курицы(десятичное число) в см: "),
                            getFloat("Введите вес курицы(десятичное число): "),
                            getString("Введите цвет глаз курицы(да-да, ее цвет глаз-это важно): "),
                            getInteger("Введите высоту полета курицы: ")
                            );
    }
}
