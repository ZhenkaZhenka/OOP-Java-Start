package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapesCollection {
//    ArrayList<Shape> collection;
    
    public static void add(ArrayList<Shape> collection){
        System.out.println("Какую фигуру вы хотите добавить?: \n" +
                            "1. Круг\n" + 
                            "2. Треугольник\n" + 
                            "3. Квадрат\n" + 
                            "4. Прямоугольник\n" +
                            "0. Если передумали добавлять фигуру\n");
        Integer number = getInteger("Введите номер фигуры: \n");
        getShape(number, collection);
    }
    
    public static void remove(ArrayList<Shape> collection){
        System.out.println("Введите название фигуры, которую хотите удалить(Латиницей)\n");
        Integer index = getIndex(collection);
        if (index > -1){
            collection.remove(collection.get(index));
            System.out.println("Удаление произошло\n");
        }
        else {
            System.out.println("Вы ввели не корректное название фигуры, процесс удаления остановлен\n");
        }
    }
    public static void infoOfAllShapes(ArrayList<Shape> collection){
        for (Shape shape : collection ) {
            System.out.println((collection.indexOf(shape)+1) + ". " + shape.info());
        }
    }
    public static void getChangeOfShape(ArrayList<Shape> collection){
        Integer index = getInteger("Введите номер элемента, " +
                        "в котором вы хотите внести изменения:") - 1;
        if (index >=0 && index < collection.size()){
            collection.get(index).changing();
        }
        else {
            System.out.println("Такого номера нет, создано всего " +
                                collection.size() + " геометрических фигур, " +
                                "попробуйте заного");
            getChangeOfShape(collection);
        }
    }

    public static void SortOfCollection(ArrayList<Shape> collection){
        int counter = 1;
        while (counter > 0){
            counter = 0;
            for (int i = 0; i < collection.size() - 1; i++) {
                if (collection.get(i).area() > collection.get(i + 1).area()){
                    Shape temp = collection.get(i);
                    collection.set(i,collection.get(i + 1));
                    collection.set(i+1,temp);
                    counter++;
                }
            }
        }
    }

    private static Integer getIndex(ArrayList<Shape> collection){
        String nameOfShape = Shape.getString("Введите имя фигуры\n");
        for (Shape shape : collection ) {
            System.out.println(shape.getName());
            if (shape.getName().equals(nameOfShape)){
                return collection.indexOf(shape);
            }
        }
        System.out.println("Такого имени нет, проверьте написание названия фигуры\n");
        getIndex(collection);
        return -1;
    }
    public static void getShape(Integer number, ArrayList<Shape> collection){
        switch(number){
            case 1: 
                collection.add(Circle.getCircle());
                break;
            case 2:
                collection.add(Triangle.getTriangle());
                break;
            case 3:
                collection.add(Square.getSquare());
                break;
            case 4:
                collection.add(Rectangle.getRectangle());
                break;
            case 0:
                return;
            default:
                System.out.println("Фигуры под таким номером нет, введите номер из списка\n");
                add(collection);
        }
    }
    public static final Integer getInteger(String message) {
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
