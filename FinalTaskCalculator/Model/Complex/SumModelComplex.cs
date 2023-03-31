namespace ModelComplex
{
    public class SumModelComplex : CalcModelComplex
    {
        // do_it
        public override Complex Result()
        {
            double real1 = x.Real;
            double image1 = x.Image;

            double real2 = y.Real;
            double image2 = y.Image;

            double newReal = real1 + real2;
            double newImage = image1 + image2;

            Complex result = new Complex(newReal, newImage);

            return result;
        }
        public override void SetX(Complex value) => this.x = value;
        public override void SetY(Complex value) => this.y = value;
    }
}