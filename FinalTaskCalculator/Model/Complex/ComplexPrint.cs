using System.Text;

namespace ModelComplex
{

    public class ComplexPrint
    {

        Complex complex;

        public ComplexPrint(Complex complex)
        {
            this.complex = complex;
        }

        public StringBuilder Print()
        {
            StringBuilder res = new StringBuilder();
            if (Convert.ToDouble(complex.Image) > 0)
            {
                res.Append(complex.Real + " + " + complex.Image + "j");
            }
            else if (Convert.ToDouble(complex.Image.ToString()) < 0)
            {
                res.Append(complex.Real + "" + complex.Image + "j");
            }
            else
            {
                res.Append(complex.Real);
            }
            return res;
        }

    }
}