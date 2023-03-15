package Classes;

public class Circle extends Shape{

    Float radius = baseSide;

    String name = "Circle R" + radius;

    public Float getRadius() {
        return radius;
    }

    @Override
    public Float perimeter() {
        return (float)(2 * Math.PI * radius);
    }

    @Override
    public Float area() {
        return (float)(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String info() {
        return name +
                "length = " + perimeter() +
                "area = " + area();
    }
    public static Circle getCircle(){
        Circle circle = new Circle();
        circle.setBaseSide(getFloat("Введите радиус круга(десятичное число): "));
        return circle;
    }
}
