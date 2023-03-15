package Classes;

public class Rectangle extends Square{
    Float firstSide = side;
    Float secondSide;
    String name = "Rectangle " + firstSide + "x" + secondSide;

    public Float getFirstSide() {
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
    public Float area() {
        return firstSide * secondSide;
    }
    @Override
    public String info() {
        return name +
                "length = " + perimeter() +
                "square = " + area();
    }

    public static Rectangle getRectangle(){
        Rectangle rect = new Rectangle();
        rect.setBaseSide(getFloat("Введите сторону прямоугольника(десятичное число): "));
        rect.setSecondSide(getFloat("Введите вторую сторону прямоугольника(десятичное число): "));
        return rect;
    }
}
