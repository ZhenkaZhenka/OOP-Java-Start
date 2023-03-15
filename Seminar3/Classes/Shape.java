package Classes;

public abstract class Shape {
    Float baseSide;

    public Float getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(Float baseSide) {
        this.baseSide = baseSide;
    }
    public abstract Float perimeter();
    public abstract Float square();

    public abstract String info();
}
