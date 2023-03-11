package Classes;

import Interfaces.Flyable;

public abstract class Birds extends Animal implements Flyable {
    protected Integer heightOfFlight;

    public Birds(Float height, Float weight, String colorOfEyes, Integer heightOfFlight) {
        super(height, weight, colorOfEyes);
        this.heightOfFlight = heightOfFlight;
    }
}
