package Classes;

public class Wolf extends Wild{
    boolean chief;

    public Wolf(Float height, Float weight, String colorOfEyes, String livingEnvironment,
                String dateOfFinding, boolean chief) {
        super(height, weight, colorOfEyes, livingEnvironment, dateOfFinding);
        this.chief = chief;
    }

    public boolean isChief() {
        return chief;
    }

    private void setChief(boolean chief) {
        this.chief = chief;
    }

    @Override
    void voice() {
        System.out.println("Зарычал по-волчьи, потому-что злой как волк");
    }

    @Override
    public String info() {
        return "Wolf" +
                "height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", chief=" + chief +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", dateOfFinding='" + dateOfFinding;
    }

    public Wolf getWolf() {
        return new Wolf(getFloat("Введите вес тигра(десятичное число): "),
                        getFloat("Введите рост тигра от пола до кончика ушей(десятичное число): "),
                        getString("Введите цвет глаз тигра: "),
                        getString("Введите регион происхождения тигра: "),
                        getString("Введите дату рождения пёселя в формате дд/мм/гггг"),
                        getBoolean("Этот волк вожак стаи? Введите true(да)/false(нет)")
                        );
    }
}
