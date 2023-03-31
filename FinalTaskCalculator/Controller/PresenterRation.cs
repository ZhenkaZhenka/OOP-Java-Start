
using static ModelRational.Rational;
using static View.ViewRational;

namespace Controller
{


    public class PresenterRation
    {
        View.ViewRational view = null!;
        ModelRational.Rational model = null!;

        public PresenterRation(ModelRational.Rational m, View.ViewRational v)
        {
            model = m;
            view = v;
        }

        public PresenterRation()
        {

        }

        public void ButtonClick()
        {
            double a = view.GetValue("a: ");
            double b = view.GetValue("b: ");
            model.SetX(a);
            model.SetY(b);

            double result = model.Result();
            view.Print(result, "Result: ");
        }

    }
}