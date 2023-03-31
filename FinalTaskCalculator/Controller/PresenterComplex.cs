using System.Text;
using static ModelComplex.ComplexPrint;
using static ModelComplex.Complex;
using static View.ViewComplex;

namespace Controller
{

    public class PresenterComplex
    {
        View.ViewComplex view  = null!;
        ModelComplex.CalcModelComplex model = null!;

        public PresenterComplex(ModelComplex.CalcModelComplex m,View.ViewComplex v)
        {
            model = m;
            view = v;
        }

        public PresenterComplex()
        {

        }

        public void ButtonClick()
        {
            
            string real1 = view.GetValue("Введите реальную часть первого числа: ");
            string image1 = view.GetValue("Введите мнимую часть первого числа: ");

            string real2 = view.GetValue("Введите реальную часть второго числа: ");
            string image2 = view.GetValue("Введите мнимую часть второго числа: ");

            double dat1_1 = Convert.ToDouble(real1); // преобразовать вещественную часть строки в double
            double dat1_2 = Convert.ToDouble(image1.Substring(0, image1.Length - 1)); // преобразовать мнимую часть
                                                                                    // строкового типа с удаленным «i»
                                                                                    // в двойной тип
            double dat2_1 = Convert.ToDouble(real2); // преобразовать вещественную часть строки в double
            double dat2_2 = Convert.ToDouble(image2.Substring(0, image2.Length - 1)); // Преобразовать мнимую часть
                                                                                    // строки с удаленным «i» в double

            ModelComplex.Complex number1 = new ModelComplex.Complex(dat1_1, dat1_2);
            ModelComplex.Complex number2 = new ModelComplex.Complex(dat2_1, dat2_2);

            model.SetX(number1);
            model.SetY(number2);

            ModelComplex.Complex result = (ModelComplex.Complex)model.Result();

            ModelComplex.ComplexPrint res = new ModelComplex.ComplexPrint(result);

            StringBuilder finalRes = res.Print();
            
            view.Print(finalRes, "Result: ");
        }

    }
}