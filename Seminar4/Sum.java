public class Sum extends Array{
    protected static Integer sum(Integer[] ar){
        Integer sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
    protected static Double sum(Double[] ar){
        Double sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
    protected static Long sum(Long[] ar){
        Long sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
    protected static Float sum(Float[] ar){
        Float sum = ar[0];
        for (int i = 1; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

}
