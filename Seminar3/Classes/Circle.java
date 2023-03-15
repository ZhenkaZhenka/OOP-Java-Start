package Classes;

public class Circle extends Shape{

    Float radius = baseSide;

    public Float getRadius() {
        return radius;
    }

    @Override
    public Float perimeter() {
        return (float)(2 * Math.PI * radius);
    }

    @Override
    public Float square() {
        return (float)(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String info() {
        return "Circle " +
                "radius =" + radius +
                "length = " + perimeter() +
                "square = " + square();
    }
}
