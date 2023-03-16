import Classes.Shape;
import Classes.ShapesCollection;

import java.util.ArrayList;

public class ProgramShapes {
    public static void main(String[] args){
        Start(new ShapesCollection());
    }

    public static void Start(ShapesCollection coll){
        boolean marker = true;
        while(marker) {
            System.out.println("Есть несколько варианов действий:\n" +
                    "1. Добавить геометрическую фигуру\n" +
                    "2. Удалить геометрическую фигуру\n" +
                    "3. Посмотреть информацию о всех геометрических фигурах\n" +
                    "4. Внести изменения в размер геометрической фигуры\n" +
                    "5. Отсортировать фигуры в списке по их площади\n" +
                    "0. Остановить работу программы");
            Integer number = Shape.getInteger("Введите номер действия из списка\n");
            marker = getAction(number, coll);
        }
        System.out.println("Хорошего дня!");
    }
    public static boolean getAction(Integer number, ShapesCollection coll){
        switch (number){
            case 1:
                coll.add();
                return true;
            case 2:
                coll.remove();
                return true;
            case 3:
                coll.infoOfAllShapes();
                return true;
            case 4:
                coll.getChangeOfShape();
                return true;
            case 5:
                coll.SortOfCollection();
                return true;
            case 0:
                return false;
            default:
                System.out.println("Что-то не то ввели, попробуйте еще раз");
                return true;
        }
    }
}
