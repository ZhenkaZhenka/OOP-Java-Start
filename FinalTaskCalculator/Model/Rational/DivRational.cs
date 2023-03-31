namespace ModelRational
{

    public class DivRational : Rational
    {
        // do_it
        public override double Result()
        {
            return x / y;
        }

        public override void SetX(double value) => this.x = value;

        public override void SetY(double value) => this.y = value;
    }
}