package Classes;

public class Tiger extends Wild{
    public Tiger(Float height, Float weight, String colorOfEyes, String livingEnvironment, String dateOfFinding) {
        super(height, weight, colorOfEyes, livingEnvironment, dateOfFinding);
    }

    @Override
    void voice() {
        System.out.println("Рык, как тигр рычит");
    }

    @Override
    public String info() {
        return "Tiger" +
                "height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", dateOfFinding='" + dateOfFinding;
    }

    public Tiger getTiger() {
        return new Tiger(getFloat("Введите вес тигра(десятичное число): "),
                            getFloat("Введите рост тигра от пола до кончика ушей(десятичное число): "),
                            getString("Введите цвет глаз тигра: "),
                            getString("Введите регион происхождения тигра: "),
                            getString("Введите дату рождения пёселя в формате дд/мм/гггг")
                            );
    }
}
