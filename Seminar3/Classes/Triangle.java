package Classes;

public class Triangle extends Shape{
    Float firstSide = baseSide;
    Float secondSide;
    double angle;
    //Below theoreme of cosinus
    Float thirdSide = (float) Math.sqrt(firstSide * firstSide + secondSide * secondSide -
            2* firstSide * secondSide * Math.cos(angle));

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

    public void setAngle(double angle) {
        this.angle = angle;
    }

    @Override
    public Float perimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public Float square() {
        Float hp = perimeter()/2;// half of perimeter
        return (float)Math.sqrt((hp - firstSide)*(hp - secondSide)*(hp-thirdSide));
    }

    @Override
    public String info() {
        return "Triangle " +
                "first side =" + firstSide +
                "second side = " + secondSide +
                "third side = " + thirdSide +
                "length = " + perimeter() +
                "square = " + square();
    }
}
