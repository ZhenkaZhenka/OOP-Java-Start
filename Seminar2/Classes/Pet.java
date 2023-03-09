package Classes;

public abstract class Pet extends Animal{
    String name;
    String breed;
    boolean injections;
    String color;
    String dateOfBirth;

    public Pet(Float height, Float weight, String colorOfEyes, String name, String breed, boolean injections, String color, String dateOfBirth) {
        super(height, weight, colorOfEyes);
        this.name = name;
        this.breed = breed;
        this.injections = injections;
        this.color = color;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isInjections() {
        return injections;
    }

    public void setInjections(boolean injections) {
        this.injections = injections;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
