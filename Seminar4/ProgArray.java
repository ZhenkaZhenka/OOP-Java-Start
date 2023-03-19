import java.util.ArrayList;

public class ProgArray {

    public static void main(String[] args) throws Exception {
        String[] col = {"fff","ytyyty","sfgdfg","jdhg","sgdfg333","xbsfsdfhrw"};
        Array<Double> ar = new Array();
        ar.print();
        ar.add(1.9);
        ar.add(2.9);
        ar.add(1.2);
        ar.add(1.7);
        ar.add(1.3);
        ar.print();
        Array<String> ar2 = new Array(col);
        String temp = ar2.max();
        System.out.println(temp);
        Double num = ar.sum();
        System.out.println(num);
        ar.print();

        ar2.print();




    }

}
