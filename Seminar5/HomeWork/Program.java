package HomeWork;

import java.util.Scanner;

import HomeWork.Controller.PresenterRation;

import HomeWork.View.Menu;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PresenterStart p = new PresenterStart(new PresenterRation(), new Menu(scanner), scanner,
                new PresenterStartRation(new Menu(scanner), scanner),
                new PresenterStartComplex(new Menu(scanner), scanner));

        p.start();
    }

}