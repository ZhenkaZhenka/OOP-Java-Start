package Classes;

import Interfaces.Petable;

public class Cat extends Pet implements Petable {

    boolean presenceOfWool;

    public Cat(Float height, Float weight, String colorOfEyes, String name, String breed, boolean injections,
               String color, String dateOfBirth, boolean presenceOfWool) {
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
}