package Classes;

import java.text.DecimalFormat;

public class Circle extends Shape{
    @Override
    public void setName() {
        DecimalFormat df = new DecimalFormat("#.##");
        name = "Circle R" + df.format(getBaseSide());
    }

    @Override
    public Float perimeter() {
        return (float)(2 * Math.PI * baseSide);
    }

    @Override
    public Float area() {
        return (float)(Math.PI * Math.pow(baseSide, 2));
    }

    @Override
    public String info() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Name is " + name +
                ", length = " + df.format(perimeter()) +
                ", area = " + df.format(area());
    }
    public static Circle getCircle(){
        Circle circle = new Circle();
        circle.setBaseSide(getFloat("Введите радиус круга(десятичное число): \n"));
        circle.setName();
        return circle;
    }

    @Override
    public void changing(){
        setBaseSide(getFloat("Введите новый радиус окружности:\n"));
        setName();
    }
}
