import java.util.ArrayList;

public class ProgArray {

    public static void main(String[] args) throws Exception {
        Integer[] col = {4,3,2,5,5,3,3,2};
        Array<Double> ar = new Array();
        ar.print();
        ar.add(1.9);
        ar.add(2.9);
        ar.add(2.3);
        ar.add(2.0);
        ar.add(3.0);
        ar.print();
        ar.delete(3.0);
        Array<Integer> ar2 = new Array(col);
        System.out.println(ar2.getClass());
        Double temp = ar.valueOf(3);
        System.out.println(temp.getClass());
        Double num = ar.sum();
        System.out.println(num);
        ar.print();

        ar2.print();




    }

}
