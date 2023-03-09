package Classes;

import Interfaces.Petable;

public class Cat extends Pet implements Petable {

    boolean presenceOfWool;


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