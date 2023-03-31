using System;
using static Controller.PresenterComplex;
using static ModelComplex.DivModelComplex;
using static ModelComplex.MultModelComplex;
using static ModelComplex.SubModelComplex;
using static ModelComplex.SumModelComplex;
using static View.Menu;
using static View.ViewComplex;

public class PresenterStartComplex
{
    View.Menu menu = null!;

    public PresenterStartComplex(View.Menu menu)
    {
        this.menu = menu;
    }

    public void StartComplex()
    {
        switch (menu.SelectFunction())
        {
            case 1:
                Console.WriteLine("Какие числа будем суммировать?");
                Controller.PresenterComplex p1 = new Controller.PresenterComplex(new ModelComplex.SumModelComplex(), new View.ViewComplex());
                p1.ButtonClick();
                Console.WriteLine("Вычисление прошло успешно");
                break;
            case 2:
                Console.WriteLine("Какие числа будем вычитать?");
                Controller.PresenterComplex p2 = new Controller.PresenterComplex(new ModelComplex.SubModelComplex(), new View.ViewComplex());
                p2.ButtonClick();
                Console.WriteLine("Вычисление прошло успешно");
                break;
            case 3:
                Console.WriteLine("Какие числа будем умножать?");
                Controller.PresenterComplex p3 = new Controller.PresenterComplex(new ModelComplex.MultModelComplex(), new View.ViewComplex());
                p3.ButtonClick();
                Console.WriteLine("Вычисление прошло успешно");
                break;
            case 4:
                Console.WriteLine("Какие числа будем делить?");
                Controller.PresenterComplex p4 = new Controller.PresenterComplex(new ModelComplex.DivModelComplex(), new View.ViewComplex());
                p4.ButtonClick();
                Console.WriteLine("Вычисление прошло успешно");
                break;
            default:
                Console.WriteLine("Неверный ввод");
                Console.WriteLine("Ошибка");
                break;
        }

    }

}