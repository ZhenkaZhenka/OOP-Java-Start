namespace ModelRational{

public abstract class Rational : RationalModel {
    public double x, y;

    // do_it
    public abstract double Result();

    public abstract void SetX(double value);

    public abstract void SetY(double value);
}
}