package Classes;

public abstract class Animal {
    Float height;
    Float weight;
    String colorOfEyes;

    public Animal(Float height, Float weight, String colorOfEyes) {
        this.height = height;
        this.weight = weight;
        this.colorOfEyes = colorOfEyes;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }
}
