import java.util.ArrayList;

public class ProgArray {

    public static void main(String[] args) throws Exception {
        Integer[] col = {5,4,3,4,5,6,33,2};
        Array<Double> ar = new Array();
        ar.print();
        ar.add(1.9);
        ar.add(1.3);
        ar.add(1.3);
        ar.add(1.9);
        ar.add(1.3);
        ar.print();
//        ar.delete(1.3);
        System.out.println(ar.size());
        ar.print();
        Array<Integer> ar2 = new Array(col);
        ar2.print();




    }

}
