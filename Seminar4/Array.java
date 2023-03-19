import java.util.Arrays;

public class Array<E> {
    protected E[] array;
    private int size;

    private Object[] defaultEmptyArray = {};

    public Array(){
        array = (E[]) defaultEmptyArray;
    }
    public Array(E[] col){
        array = col;
        size = array.length;
    }

    public void add(E obj){
        int newSize = array.length +1 ;
        E[] newArray;
        newArray = Arrays.copyOf(array, newSize);
        newArray[array.length] = obj;
        array =  Arrays.copyOf(newArray, newSize);
        size += 1;
    }
    public void delete(int index){
        int counter = 0;
        int newSize = array.length -1;
        E[] temp = (E[])new Object[newSize];
        for (int i = 0; i <= newSize-1; i++) {
            if(i == index){counter++;}
            temp[i] = array[i + counter];
        }
        array = Arrays.copyOf(temp, newSize);
        size -= 1;
    }

    public void delete(E obj){
        for (int i = 0; i < array.length; i+=1) {
            if(array[i].equals(obj)){
                delete(i);
                delete(obj);
            }
        }
    }
    public int size(){
        return array.length;
    }
    public int indexOf(E obj){
        for (int i = 0; i < size; i++){
            if (array[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
    public boolean contain(E obj){
        for (var item : array) {
            if (item.equals(obj)){return true;}
        }
        return false;
    }
    protected void print(){
        for (var item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}



