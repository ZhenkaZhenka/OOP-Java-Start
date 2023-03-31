namespace ModelRational;

public class SumRational : Rational {

    // do_it
    public override double Result() => x + y;

    public override void SetX(double value) => this.x = value;

    public override void SetY(double value) => this.y = value;
}