import Classes.Array;

import java.text.DecimalFormat;

public class ProgArray {

    public static void main(String[] args) throws Exception {
        /*Презентация работы с массивом типа Double:
        1. Создание объекта Array<Double>
        2. После создания получаем пустой массив
        3. Добавляем 5 элементов типа Double
        4. Печатае для демонстрации работы
        5. Удаляем объект с значением 3.0
        6. Удаляем объект под индексом 4
        7. печатаем результат
        * */
        Array<Double> doubleAr = new Array();
        System.out.println("Массив после инициализации:");
        doubleAr.print();
        System.out.println("Размер массива после инициализации: " + doubleAr.size());
        doubleAr.add(1.9);
        doubleAr.add(2.9);
        doubleAr.add(2.3);
        doubleAr.add(2.0);
        doubleAr.add(3.0);
        System.out.println("Массив после добавления элементов: ");
        doubleAr.print();
        System.out.println("Массив имеет размер: " + doubleAr.size());
        doubleAr.bubleSort();
        System.out.println("Массив после сортировки пузырьком: ");
        doubleAr.print();
        doubleAr.delete(3.0);
        doubleAr.delete(4);
        System.out.println("Массив после удаления элементов");
        doubleAr.print();
        Double temp = doubleAr.mult();
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Произведение всех элементов в массиве "+ df.format(temp));
        System.out.println("Максимальный элемент в массиве: " + doubleAr.max());

        System.out.println();

        System.out.println("Демонстрация работы с массивом типа Integer: ");
        Integer[] col = {4,3,2,5,5,3,3,2};
        Array<Integer> intAr = new Array(col);
        System.out.println("Массив типа Integer после инициализации: ");
        intAr.print();
        System.out.println("Массив после сортировки вставками: ");
        intAr.insertSort();
        intAr.print();
        Integer num = intAr.sum();
        System.out.println("Сумма всех элементов в массиве "+num);
        System.out.println("Значение элемента массива под индексом 3(должно быть 5): " + intAr.valueOf(3));
        System.out.println("Индекс элемента со значение 5(должен быть 3): " + intAr.indexOf(5));
        System.out.println("Минимальный элемент в массиве: " + intAr.min());
        System.out.println("Наличие элемента с заданным значением(5-такое значеение есть): " + intAr.contain(5));
        System.out.println("Наличие элемента с заданным значением(10-такого значеения нет): " + intAr.contain(10));


    }

}
