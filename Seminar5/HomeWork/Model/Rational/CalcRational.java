package HomeWork.Model.Rational;

public abstract class CalcRational implements ModelRational {
    double x, y;

    // do_it
    public abstract double result();

    public abstract void setX(double value);

    public abstract void setY(double value);
}