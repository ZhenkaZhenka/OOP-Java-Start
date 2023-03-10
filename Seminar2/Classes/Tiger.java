package Classes;

public class Tiger extends Wild{
    public Tiger(Float height, Float weight, String colorOfEyes, String livingEnvironment, String dateOfFinding) {
        super(height, weight, colorOfEyes, livingEnvironment, dateOfFinding);
    }

    @Override
    public void voice() {
        System.out.println("Рык, как тигр рычит\n");
    }

    @Override
    public String info() {
        return "Tiger: " +
                "height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", dateOfFinding='" + dateOfFinding;
    }

    public static Tiger getTiger() {
        return new Tiger(getFloat("Введите рост тигра от пола до кончика ушей(десятичное число): "),
                            getFloat("Введите вес тигра(десятичное число): "),
                            getString("Введите цвет глаз тигра: "),
                            getString("Введите регион происхождения тигра: "),
                            getString("Введите дату рождения тигра в формате дд/мм/гггг")
                            );
    }
}
