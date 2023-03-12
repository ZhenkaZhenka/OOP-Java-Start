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
    public void voice() {
        System.out.println("Зарычал по-волчьи, потому-что злой как волк\n");
    }

    @Override
    public String info() {
        return "Wolf: " +
                "height=" + height +
                ", weight=" + weight +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", chief=" + chief +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", dateOfFinding='" + dateOfFinding;
    }

    public static Wolf getWolf() {
        return new Wolf(getFloat("Введите рост волка от пола до кончика ушей(десятичное число): "),
                        getFloat("Введите вес волка(десятичное число): "),
                        getString("Введите цвет глаз волка: "),
                        getString("Введите регион происхождения волка: "),
                        getString("Введите дату рождения волка в формате дд/мм/гггг: "),
                        getBoolean("Этот волк вожак стаи? Введите true(да)/false(нет): ")
                        );
    }
}
