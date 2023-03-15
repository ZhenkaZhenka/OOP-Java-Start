package Classes;

public class Triangle extends Shape{
    Float firstSide = baseSide;
    Float secondSide;
    Float angle;
    //Below theoreme of cosinus
    Float thirdSide = (float) Math.sqrt(firstSide * firstSide + secondSide * secondSide -
            2* firstSide * secondSide * Math.cos((double)angle));
    String name = "Triangle " + firstSide + "x" + secondSide + "x" + thirdSide;

    public Float getFirstSide() {
        return firstSide;
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

    public double getAngle() {
        return angle;
    }

    public void setAngle(Float angle) {
        this.angle = angle;
    }

    @Override
    public Float perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public Float area() {
        Float hp = perimeter()/2;// half of perimeter
        return (float)Math.sqrt((hp - firstSide)*(hp - secondSide)*(hp-thirdSide));
    }

    @Override
    public String info() {
        return name +
                "length = " + perimeter() +
                "area = " + area();
    }

    public static Triangle getTriangle(){
        Triangle trian = new Triangle();
        trian.setBaseSide(getFloat("Введите сторону треугольника(десятичное число): "));
        trian.setSecondSide(getFloat("Введите вторую сторону треугольника(десятичное число): "));
        trian.setAngle(getFloat("Введите угол между двумя этими сторонами: "));
        return trian;
    }
}
