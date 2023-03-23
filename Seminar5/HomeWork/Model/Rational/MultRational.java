package HomeWork.Model.Rational;

public class MultRational extends CalcRational {

    public MultRational() {

    }

    // do_it
    @Override
    public double result() {
        return x * y;
    }

    @Override
    public void setX(double value) {
        super.x = value;

    }

    @Override
    public void setY(double value) {
        super.y = value;

    }

}