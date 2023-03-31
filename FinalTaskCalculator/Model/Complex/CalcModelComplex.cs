using static ModelComplex.Complex;
namespace ModelComplex
{
    public abstract class CalcModelComplex
    {
        public ModelComplex.Complex x = null!;
        public ModelComplex.Complex y = null!;

        public abstract Complex Result();
        public abstract void SetX(Complex value);
        public abstract void SetY(Complex value);
    }
}