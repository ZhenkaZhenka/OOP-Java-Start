package Classes;

import java.util.Arrays;

public class MultOfArrayElements extends Array{
    protected static <E> Integer multInt(E[] ar){
        Integer[] temp = Arrays.copyOf(ar, ar.length,Integer[].class);
        Integer mult = temp[0];
        for (int i = 1; i < temp.length; i++) {
            mult *= temp[i];
        }
        return mult;
    }
    protected static  <E> Long multLong(E[] ar){
        Long[] temp = Arrays.copyOf(ar, ar.length,Long[].class);
        Long mult = temp[0];
        for (int i = 1; i < ar.length; i++) {
            mult *= temp[i];
        }
        return mult;
    }
    protected static <E> Double multDouble(E[] ar){
        Double[] temp = Arrays.copyOf(ar, ar.length,Double[].class);
        Double mult = temp[0];
        for (int i = 1; i < temp.length; i++) {
            mult *= temp[i];
        }
        return mult;
    }
    protected static <E> Float multFloat(E[] ar){
        Float[] temp = Arrays.copyOf(ar, ar.length,Float[].class);
        Float mult = temp[0];
        for (int i = 1; i < temp.length; i++) {
            mult *= temp[i];
        }
        return mult;
    }

}
