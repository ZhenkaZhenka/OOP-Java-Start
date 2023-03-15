package Classes;

public class Square extends Shape{
    Float side = baseSide;

    @Override
    public Float perimeter() {
        return side * 4;
    }

    @Override
    public Float square() {
        return side * side;
    }

    @Override
    public String info() {
        return "Square " +
                "side =" + side +
                "length = " + perimeter() +
                "square = " + square();
    }

}
