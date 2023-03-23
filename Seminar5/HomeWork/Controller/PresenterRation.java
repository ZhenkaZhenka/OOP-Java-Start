package HomeWork.Controller;

import HomeWork.Model.Rational.ModelRational;
import HomeWork.View.ViewRational;

public class PresenterRation {
    ViewRational view;
    ModelRational model;

    public PresenterRation(ModelRational m, ViewRational v) {
        model = m;
        view = v;
    }

    public PresenterRation() {

    }

    public void buttonClick() {
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);

        double result = model.result();
        view.print(result, "Result: ");
    }

}