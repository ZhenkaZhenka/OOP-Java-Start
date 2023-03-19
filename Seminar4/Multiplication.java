public class Multiplication extends Array{
    protected static Integer mult(Integer[] ar){
        Integer mult = ar[0];
        for (int i = 1; i < ar.length; i++) {
            mult *= ar[i];
        }
        return mult;
    }
    protected static Long mult(Long[] ar){
        Long mult = ar[0];
        for (int i = 1; i < ar.length; i++) {
            mult *= ar[i];
        }
        return mult;
    }
    protected static Double mult(Double[] ar){
        Double mult = ar[0];
        for (int i = 1; i < ar.length; i++) {
            mult *= ar[i];
        }
        return mult;
    }
    protected static Float mult(Float[] ar){
        Float mult = ar[0];
        for (int i = 1; i < ar.length; i++) {
            mult *= ar[i];
        }
        return mult;
    }

}
