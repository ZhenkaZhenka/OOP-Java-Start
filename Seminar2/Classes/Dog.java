package Classes;

public class Dog extends Pet{
    boolean trainable;

    public Dog(Float height, Float weight, String colorOfEyes, String name, String breed,
               boolean injections, String color, String dateOfBirth, boolean trainable) {
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
}
