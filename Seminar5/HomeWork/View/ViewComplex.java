package HomeWork.View;

import java.util.Scanner;

public class ViewComplex {
    Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }
    public void print(StringBuilder data, String title) {
        System.out.printf("%s %s\n", title, data);
    }

}