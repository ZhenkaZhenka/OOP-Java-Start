package Classes;

public abstract class Birds extends Animal{
    protected Integer heightOfFlight;

    public Birds(Float height, Float weight, String colorOfEyes, Integer heightOfFlight) {
        super(height, weight, colorOfEyes);
        this.heightOfFlight = heightOfFlight;
    }

    public void infoFlight(Integer heightOfFlight){
        System.out.println("Я лечу на высоте " + heightOfFlight + "m");
    }

}
