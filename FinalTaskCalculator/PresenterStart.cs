using System;
using static Controller.PresenterRation;
using static View.Menu;

public class PresenterStart {

    Controller.PresenterRation presenterRation  = null!;
    View.Menu menu = null!;
    PresenterStartRation startRation  = null!;
    PresenterStartComplex startComplex  = null!;

    public PresenterStart(Controller.PresenterRation presenterRation,
                          View.Menu menu,
                          PresenterStartRation startRation,
                          PresenterStartComplex startComplex) {
        this.presenterRation = presenterRation;
        this.menu = menu;
        this.startRation = startRation;
        this.startComplex = startComplex;
    }

    public void Start() {
        switch (menu.SelectCalc()) {
            case 1:
                Console.WriteLine("Выбраны рациональные числа");
                startRation.StartRation();
                break;
            case 2:
                Console.WriteLine("Выбраны комплексные числа");
                startComplex.StartComplex();
                break;
            default:
                Console.WriteLine("Ошибка");
                Console.WriteLine("Неверный ввод");
                break;

        }
    }

}