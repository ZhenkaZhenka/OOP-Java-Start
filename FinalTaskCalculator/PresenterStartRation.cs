using System;
using static Controller.PresenterRation;
using static ModelRational.DivRational;
using static ModelRational.MultRational;
using static ModelRational.SubModelRational;
using static ModelRational.SumRational;
using static View.Menu;
using static View.ViewRational;

public class PresenterStartRation
{
    View.Menu menu = null!;

    public PresenterStartRation(View.Menu menu)
    {
        this.menu = menu;
    }

    public void StartRation()
    {
        switch (menu.SelectFunction())
        {
            case 1:
                Console.WriteLine("Какие числа будем суммировать?");
                Controller.PresenterRation p1 = new Controller.PresenterRation(new ModelRational.SumRational(), new View.ViewRational());
                p1.ButtonClick();
                Console.WriteLine("Вычисление прошло успешно");
                break;
            case 2:
                Console.WriteLine("Какие числа будем вычитать?");
                Controller.PresenterRation p2 = new Controller.PresenterRation(new ModelRational.SubModelRational(), new View.ViewRational());
                p2.ButtonClick();
                Console.WriteLine("Вычисление прошло успешно");

                break;
            case 3:
                Console.WriteLine("Какие числа будем умножать?");
                Controller.PresenterRation p3 = new Controller.PresenterRation(new ModelRational.MultRational(), new View.ViewRational());
                p3.ButtonClick();
                Console.WriteLine("Вычисление прошло успешно");

                break;
            case 4:
                Console.WriteLine("Какие числа будем делить?");
                Controller.PresenterRation p4 = new Controller.PresenterRation(new ModelRational.DivRational(), new View.ViewRational());
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