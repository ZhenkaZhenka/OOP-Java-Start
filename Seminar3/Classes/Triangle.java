package Classes;

import java.text.DecimalFormat;

public class Triangle extends Shape{
    Float secondSide;
    Float angle;
    Float thirdSide;

    public Float getFirstSide() {
        return baseSide;
    }

    public Float getThirdSide() {
        return thirdSide;
    }

    public Float getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Float secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide() {
        this.thirdSide = (float) Math.sqrt(getBaseSide() * getBaseSide() +
                getSecondSide() * getSecondSide() -
                2* getBaseSide() * getSecondSide() * Math.cos(getAngle()));
    }

    @Override
    public void setName() {
        DecimalFormat df = new DecimalFormat("#.##");
        name = "Triangle " +
                df.format(getBaseSide()) + "x" +
                df.format(getSecondSide()) + "x" +
                df.format(getThirdSide());
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(Float angle) {
        this.angle = angle;
    }

    @Override
    public Float perimeter() {
        return baseSide + secondSide + thirdSide;
    }

    @Override
    public Float area() {
        Float hp = perimeter()/2;// half of perimeter
        return (float)Math.sqrt((hp - baseSide)*(hp - secondSide)*(hp-thirdSide));
    }

    @Override
    public String info() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Name is " + name +
                ", length = " + df.format(perimeter()) +
                ", area = " + df.format(area());
    }

    public static Triangle getTriangle(){
        Triangle trian = new Triangle();
        trian.setBaseSide(getFloat("Введите сторону треугольника(десятичное число): "));
        trian.setSecondSide(getFloat("Введите вторую сторону треугольника(десятичное число): "));
        trian.setAngle(getFloat("Введите угол между двумя этими сторонами: "));
        trian.setThirdSide();
        trian.setName();
        return trian;
    }

    @Override
    public void changing(){
        System.out.println("Какой параметр вы хотите изменить?\n" +
                "1. Сторона А(" + baseSide + ")\n" +
                "2. Сторона B(" + secondSide + ")\n" +
                "3. Угол между стороной А и В(" + angle + ")\n" +
                "0. Ничего не хочу менять, просто проверяю");
        Integer number = Shape.getInteger("Введите номер");
        if (number == 1) {
            setBaseSide(getFloat("Введите новый размер(десятичное число):\n"));
            setName();
        }
        else if(number == 2){
            setSecondSide(getFloat("Введите новый размер(десятичное число):\n"));
            setName();
        }
        else if(number == 3){
            setAngle(getFloat("Введите новый угол(десятичное число):\n"));
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
