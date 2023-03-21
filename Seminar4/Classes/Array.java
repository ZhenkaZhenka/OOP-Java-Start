package Classes;

import java.util.Arrays;

public class Array<E> {
    private E[] array;
    private int size;
    private Object[] defaultEmptyArray = {};

    /*Конструктор, не принимающий параметров, создает пустой массив*/
    public Array() {
        array = (E[]) defaultEmptyArray;
    }

    /*Конструктор, принимающий массив произвольного типа данных в качестве параметра*/
    public Array(E[] col) {
        array = col;
        size = array.length;
    }

    /*Добавление элемента в конец массива*/
    public void add(E obj) {
        int newSize = array.length + 1;
        E[] newArray;
        newArray = Arrays.copyOf(array, newSize);
        newArray[array.length] = obj;
        array = Arrays.copyOf(newArray, newSize);
        size += 1;
    }

    /*Удаление элемента по индексу*/
    public void delete(int index) {
        int counter = 0;
        int newSize = array.length - 1;
        E[] temp = (E[]) new Object[newSize];
        for (int i = 0; i <= newSize - 1; i++) {
            if (i == index) {
                counter++;
            }
            temp[i] = array[i + counter];
        }
        array = Arrays.copyOf(temp, newSize);
        size -= 1;
    }

    /*Удаление всех элементов, имеющий значение параметра*/
    public void delete(E obj) {
        for (int i = 0; i < array.length; i += 1) {
            if (array[i].equals(obj)) {
                delete(i);
                delete(obj);
            }
        }
    }

    /*Возвращает минимальное значение из массива*/
    public <E extends Comparable<E>> E min() {
        E min = (E) array[0];
        for (int i = 1; i < size; i++) {
            if (min.compareTo((E) array[i]) > 0) {
                min = (E) array[i];
            }
        }
        return min;
    }

    /*Возвращает максимальное значение из массива*/
    public <E extends Comparable<E>> E max() {
        E max = (E) array[0];
        for (int i = 1; i < size; i++) {
            if (max.compareTo((E) array[i]) < 0) {
                max = (E) array[i];
            }
        }
        return max;
    }

    /*Возвращает размер массива*/
    public int size() {
        return size;
    }

    /*Возвращает индекс первого элемента с заданным значением*/
    public <E> int indexOf(E obj) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /*Возращает булевое значениние нахождение элемента:
    true-такой элемент находится в массиве,
    false - такого элемента нет в массиве
    * */
    public <E> boolean contain(E obj) {
        for (var item : array) {
            if (item.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /*Печать массива на экран*/
    public void print() {
        for (var item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /*Возвращает значение элемента с заданным индексом в массиве*/
    public <E> E valueOf(int index) {
        return (E) array[index];
    }

    /* Возращает сумму всех элементов в массиве.
    * Работает только с типами-наследниками Number,
    * Считает сумму только для Integer, Long, Double, Float.
    * На типы данных Byte, Short, Boolean выдает сообщение об отказе считать сумму(Исключение выводиться не будет)
    */
    public <E extends Number> E sum() {
        if (array instanceof Byte[] ||
                array instanceof Short[] ||
                array instanceof Boolean[]) {
            System.out.println("This array has too short type to calculate it's sum, you shouldn't do it ;)");
        }
        if (array instanceof Integer[]) {
            return (E) SumOfElementsInArray.sumInt((Integer[]) array);
        }
        if (array instanceof Long[]) {
            return (E) SumOfElementsInArray.sumLong((Long[]) array);
        }
        if (array[0] instanceof Double[]) {
            return (E) SumOfElementsInArray.sumDouble(array);
        }
        if (array[0] instanceof Float) {
            return (E) SumOfElementsInArray.sumFloat(array);
        }
        return null;
    }

    /*Возращает произведение всех элементов в массиве.
     *Работает только с типами-наследниками Number,
     * Считает сумму только для Integer, Long, Double, Float.
     * На типы данных Byte, Short, Boolean выдает сообщение об отказе считать сумму(Исключение выводиться не будет)
    */
    public <E extends Number> E mult() {
        if (array instanceof Byte[] ||
                array instanceof Short[] ||
                array instanceof Boolean[]) {
            System.out.println("This array has too short type to calculate it multiplying, you shouldn't do it ;)");
        }
        if (array instanceof Integer[]) {
            return (E) MultOfArrayElements.multInt(array);
        }
        if (array instanceof Long[]) {
            return (E) MultOfArrayElements.multLong(array);
        }
        if (array[0] instanceof Double) {
            return (E) MultOfArrayElements.multDouble(array);
        }
        if (array[0] instanceof Float) {
            return (E) MultOfArrayElements.multFloat(array);
        }
        return null;
    }

    /*Пузырьковая сортировка*/
    public <E extends Comparable<E>> void bubleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                E t = (E) array[j];
                if (t.compareTo((E) array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    /*Сортировка вставками*/
    public <E extends Comparable<E>> void insertSort() {
        for (int i = 1; i < size; i++) {
            E t = (E) array[i];
            for (int j = i; j > 0 && t.compareTo((E) array[j - 1]) < 0; j--) {
                swap(array, j, j - 1);
            }
        }
    }

    /*Сортировка выбором*/
    public <E extends Comparable<E>> void choiseSort() {
        for (int i = 0; i < size; i++) {
            int indexMin = i;
            for (int j = i + 1; j < size; j++) {
                E t = (E) array[indexMin];
                if (t.compareTo((E) array[j]) > 0) {
                    indexMin = j;
                }
            }
            swap(array, i, indexMin);
        }
    }

    /*Просто метод для замены элементов в массиве, используется для сортровок*/
    private static <E> void swap(E[] ar, int i, int j) {
        E t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
}



