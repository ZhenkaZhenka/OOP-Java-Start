import org.jetbrains.annotations.NotNull;

public class Sum extends Array{
    protected static Integer sumInt(Integer[] ar){
        Integer sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    protected static Double sumDouble(@NotNull Double[] ar){
        Double sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
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
    protected static Float sumFloat(Float[] ar){
        Float sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

}
