package Classes;

import Interfaces.Animalable;

import java.util.Scanner;
public abstract class Animal implements Animalable {
    Float height;
    Float weight;
    String colorOfEyes;

    public Animal(Float height, Float weight, String colorOfEyes) {
        this.height = height;
        this.weight = weight;
        this.colorOfEyes = colorOfEyes;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public static final Float getFloat(String message){
            Scanner scan = new Scanner(System.in);
            System.out.print(message);
            try {
                Float number = scan.nextFloat();
                scan.close();
                return number;
            } catch (Exception e) {
                System.out.println("Input real number");
                return getFloat(message);
            }
    }

    public static final Integer getInteger(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        try {
            int number = scan.nextInt();
            scan.close();
            return number;
        } catch (Exception e) {
            System.out.println("Input integer number");
            return getInteger(message);
        }
    }

    public static final String getString(String message){
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        return scan.toString();
    }

    public static final boolean getBoolean(String message){
        Scanner scan = new Scanner(System.in);
        System.out.print(message);
        try {
            boolean number = scan.nextBoolean();
            scan.close();
            return number;
        } catch (Exception e) {
            System.out.println("Input true or false");
            return getBoolean(message);
        }
    }


}
