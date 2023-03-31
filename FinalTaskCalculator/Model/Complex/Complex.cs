namespace ModelComplex
{
    public class Complex
    {

        /**
         * real - реальная часть
         * image - мнимая часть
         */

        public double real;
        public double image;

        public double Real
        {
            get
            {
                return this.real;
            }
            set
            {
                this.real = value;
            }
        }
        public double Image
        {
            get
            {
                return this.image;
            }
            set
            {
                this.image = value;
            }
        }

        public Complex(double real, double image)
        {
            this.real = real;
            this.image = image;
        }
    }
}