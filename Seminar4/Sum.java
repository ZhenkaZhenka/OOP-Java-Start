import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Sum extends Array{
    protected static Integer sumInt(Integer[] ar){
        Integer sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    protected static <E> Double sumDouble(@NotNull E[] ar){
        Double[] temp = Arrays.copyOf(ar, ar.length, Double[].class);
        Double sum = temp[0];
        for (int i = 1; i < temp.length; i++) {
            sum += temp[i];
        }
        return sum;
    }
    protected static Long sumLong(Long[] ar){
        Long sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
    protected static <E> Float sumFloat(E[] ar){
        Float[] temp = Arrays.copyOf(ar, ar.length, Float[].class);
        Float sum = temp[0];
        for (int i = 1; i < ar.length; i++) {
            sum += temp[i];
        }
        return sum;
    }

}
