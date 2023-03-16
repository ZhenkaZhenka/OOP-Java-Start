package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapesCollection {
    static ArrayList<Shape> collection;
    public ShapesCollection(){
        collection = new ArrayList<>();
    }
    public void add(){
        System.out.println("""
                Какую фигуру вы хотите добавить?:\s
                1. Круг
                2. Треугольник
                3. Квадрат
                4. Прямоугольник
                0. Если передумали добавлять фигуру
                """);
        Integer number = getInteger("Введите номер фигуры: \n");
        getShape(number);
    }
    
    public void remove(){
        System.out.println("Введите название фигуры, которую хотите удалить(Латиницей)\n");
        Integer index = getIndex();
        if (index > -1){
            collection.remove(collection.get(index));
            System.out.println("Удаление произошло\n");
        }
        else {
            System.out.println("Вы ввели не корректное название фигуры, процесс удаления остановлен\n");
        }
    }
    public void infoOfAllShapes(){
        for (Shape shape : collection ) {
            System.out.println((collection.indexOf(shape)+1) + ". " + shape.info());
        }
    }
    public void getChangeOfShape(){
        int index = getInteger("Введите номер элемента, " +
                        "в котором вы хотите внести изменения:") - 1;
        if (index >=0 && index < collection.size()){
            collection.get(index).changing();
        }
        else {
            System.out.println("Такого номера нет, создано всего " +
                                collection.size() + " геометрических фигур, " +
                                "попробуйте заного");
            getChangeOfShape();
        }
    }

    public void SortOfCollection(){
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

    private Integer getIndex(){
        String nameOfShape = Shape.getString("Введите имя фигуры\n");
        for (Shape shape : collection ) {
            System.out.println(shape.getName());
            if (shape.getName().equals(nameOfShape)){
                return collection.indexOf(shape);
            }
        }
        System.out.println("Такого имени нет, проверьте написание названия фигуры\n");
        getIndex();
        return -1;
    }
    public void getShape(Integer number){
        switch (number) {
            case 1 -> collection.add(Circle.getCircle());
            case 2 -> collection.add(Triangle.getTriangle());
            case 3 -> collection.add(Square.getSquare());
            case 4 -> collection.add(Rectangle.getRectangle());
            case 0 -> {
            }
            default -> {
                System.out.println("Фигуры под таким номером нет, введите номер из списка\n");
                add();
            }
        }
    }
    public static Integer getInteger(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        try {
            return scan.nextInt();
        } catch (Exception e) {
            System.out.println("Input integer number");
            return getInteger(message);
        }
    }
    
}
