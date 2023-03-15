package Classes;

public class Rectangle extends Square{
    Float firstSide = side;
    Float secondSide;

    public Float getFirstside() {
        return firstSide;
    }

    public Float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Float secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public Float perimeter() {
        return 2 * (firstSide + secondSide);
    }

    @Override
    public Float square() {
        return firstSide * secondSide;
    }
    @Override
    public String info() {
        return "Rectangle " +
                "first side = " + firstSide +
                "second side = " + secondSide +
                "length = " + perimeter() +
                "square = " + square();
    }
}
