package Classes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Square extends Shape{
    @Override
    public void setName() {
        DecimalFormat df = new DecimalFormat("#.##");
        name = "Square " + df.format(getBaseSide()) + "x" +
                df.format(getBaseSide());
    }

    public Float getSide() {
        return baseSide;
    }

    @Override
    public Float perimeter() {
        return baseSide * 4;
    }

    @Override
    public Float area() {
        return baseSide * baseSide;
    }

    @Override
    public String info() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Name is " + name +
                ", length = " + df.format(perimeter()) +
                ", area = " + df.format(area());
    }

    public static Square getSquare(){
        Square square = new Square();
        square.setBaseSide(getFloat("Введите сторону квадрата(десятичное число): "));
        square.setName();
        return square;
    }

    @Override
    public void changing(){
        setBaseSide(getFloat("Введите новый размер стороны квадрата:\n"));
        setName();
    }
}
