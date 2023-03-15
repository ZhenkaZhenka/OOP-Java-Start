package Classes;

import java.util.Scanner;

public abstract class Shape {
    Float baseSide;
    String name;

    public String getName(){
        return name;
    }

    public Float getBaseSide() {
        return baseSide;
    }

    public abstract void setName();

    public void setBaseSide(Float baseSide) {
        this.baseSide = baseSide;
    }
    public abstract void changing();
    public abstract Float perimeter();
    public abstract Float area();

    public abstract String info();

    public static final Float getFloat(String message){
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        try {
            Float number = scan.nextFloat();
            return number;
        } catch (Exception e) {
            System.out.println("Input real number");
            return getFloat(message);
        }
    }

    public static final String getString(String message){
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        String word = scan.nextLine();
        return word;
    }

    public static final Integer getInteger(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        try {
            int number = scan.nextInt();
            return number;
        } catch (Exception e) {
            System.out.println("Input integer number");
            return getInteger(message);
        }
    }
}
