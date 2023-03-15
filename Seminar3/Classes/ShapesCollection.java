package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapesCollection {
    ArrayList<Shape> collection;
    
    public void add(){
        System.out.println("Какую фигуру вы хотите добавить?: \n" +
                            "1. Круг\n" + 
                            "2. Треугольник\n" + 
                            "3. Квадрат\n" + 
                            "4. Прямоугольник\n");
        Integer number = getInteger("Введите номер фигуры: ");
        getShape(number);
    }
    
    public void remove(){
        System.out.println("Введите название фигуры, которую хотите удалить(Латиницей)");
        Integer index = getIndex();
        if (index > -1){
            collection.remove(index);
        }
        else {
            System.out.println("Вы ввели не корректное название фигуры, процесс удаления остановлен");
        }
    }
    public void infoOfAllShapes(){
        for (Shape shape : collection ) {
            System.out.println(shape.info());
        }
    }
    public void showPerimeters(){
        for (Shape shape : collection ) {
            System.out.println(shape.perimeter());
        }
    }
    public void showAreas(){
        for (Shape shape : collection ) {
            System.out.println(shape.area());
        }
    }

    private Integer getIndex(){
        String nameOfShape = Shape.getString("Введите имя фигуры");
        for (Shape shape : collection ) {
            if (shape.getName() == nameOfShape){
                return collection.indexOf(shape);
            }
        }
        System.out.println("Такого имени нет, проверьте написание названия фигуры\n");
        getIndex();
        return -1;
    }
    public void getShape(Integer number){
        switch(number){
            case 1: 
                Circle.getCircle();
                break;
            case 2: 
                Triangle.getTriangle();
                break;
            case 3:
                Square.getSquare();
                break;
            case 4:
                Rectangle.getRectangle();
                break;
            default:
                System.out.println("Фигуры под таким номером нет, введите номер из списка\n");
                add();
        }
    }
    public final Integer getInteger(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        try {
            int number = scan.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Input integer number");
            return getInteger(message);
        }
    }
    
}
