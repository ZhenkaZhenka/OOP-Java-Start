package Classes;

import Interfaces.Flyable;

public class Stork extends Birds implements Flyable {

    public Stork(Float height, Float weight, String colorOfEyes, Integer heightOfFlight) {
        super(height, weight, colorOfEyes, heightOfFlight);
    }

    @Override
    void voice() {
        System.out.println("Что-то прокричал как аист");
    }

    @Override
    public String info() {
        return "Stork" +
                "height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", heightOfFlight=" + heightOfFlight;
    }
    public void fly(){
        System.out.println("Аист летает на высоте " + heightOfFlight + "m");
    }

    public Stork getStork(){
        return new Stork(getFloat("Введите рост аиста(десятичное число): "),
                        getFloat("Введите вес аиста(десятичное число): "),
                        getString("Введите цвет глаз аиста(да-да, ее цвет глаз-это важно): "),
                        getInteger("Введите высоту полета аиста: ")
                        );
    }
}
