package Classes;

import java.util.Scanner;

public class Square extends Shape{
    Float side = baseSide;
    String name = "Square " + side + "x" + side;

    public Float getSide() {
        return side;
    }

    @Override
    public Float perimeter() {
        return side * 4;
    }

    @Override
    public Float area() {
        return side * side;
    }

    @Override
    public String info() {
        return name +
                "length = " + perimeter() +
                "area = " + area();
    }

    public static Square getSquare(){
        Square square = new Square();
        square.setBaseSide(getFloat("Введите сторону квадрата(десятичное число): "));
        return square;
    }
}
