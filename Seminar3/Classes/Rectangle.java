package Classes;

import java.text.DecimalFormat;

public class Rectangle extends Square{
    Float secondSide;

    @Override
    public void setName() {
        DecimalFormat df = new DecimalFormat("#.##");
        name = "Rectangle " +
                df.format(getBaseSide()) + "x" +
                        df.format(getSecondSide());
    }

    public Float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Float secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public Float perimeter() {
        return 2 * (baseSide + secondSide);
    }

    @Override
    public Float area() {
        return baseSide * secondSide;
    }
    @Override
    public String info() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Name is " + name +
                ", length = " + df.format(perimeter()) +
                ", square = " + df.format(area());
    }

    public static Rectangle getRectangle(){
        Rectangle rect = new Rectangle();
        rect.setBaseSide(getFloat("Введите сторону прямоугольника(десятичное число): "));
        rect.setSecondSide(getFloat("Введите вторую сторону прямоугольника(десятичное число): "));
        rect.setName();
        return rect;
    }

    @Override
    public void changing(){
        System.out.println("Какой параметр вы хотите изменить?\n" +
                            "1. Сторона А(" + baseSide + ")\n" +
                            "2. Сторона B(" + secondSide + ")\n" +
                            "0. Ничего не хочу менять, просто проверяю");
        Integer number = Shape.getInteger("Введите номер");
        if (number == 1) {
            setBaseSide(getFloat("Введите размер(десятичное число):\n"));
            setName();
        }
        else if(number == 2){
            setSecondSide(getFloat("Введите размер(десятичное число):\n"));
            setName();
        }
        else if(number == 0){
            System.out.println("Изменения остановлены");
        }
        else {
            System.out.println("Такого в списке нет");
            changing();
        }
    }
}
