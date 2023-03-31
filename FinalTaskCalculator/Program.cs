using static Controller.PresenterRation;
using static View.Menu;

public class Program
{
    public static void Main(String[] args)
    {
        PresenterStart p = new PresenterStart(new Controller.PresenterRation(), new View.Menu(),
                new PresenterStartRation(new View.Menu()),
                new PresenterStartComplex(new View.Menu()));

        p.Start();
    }
}