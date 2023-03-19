import java.util.ArrayList;

public class ProgArray {

    public static void main(String[] args) throws Exception {
        Long[] col = {4l,3l,2l,5l,5l,3l,3l,2l};
        Array<Float> ar = new Array();
        ar.print();
        ar.add(1.9F);
        ar.add(2.9F);
        
        
        
        ar.print();
        Array<Long> ar2 = new Array(col);
        Long temp = ar2.mult();
        System.out.println(temp);
        Float num = ar.sum();
        System.out.println("77" + num);
        ar.print();

        ar2.print();




    }

}
