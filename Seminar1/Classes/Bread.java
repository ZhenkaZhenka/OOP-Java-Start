public class Bread extends Food {
    String flour;

    public Bread(String name, String unit, Integer expiredInDays, String flour) {
        super(name, unit, expiredInDays);
        this.flour = flour;
    }

    public Bread(String name, Integer amount, String unit, Integer expiredInDays, String flour) {
        super(name, amount, unit, expiredInDays);
        this.flour = flour;
    }

    public Bread(String name, Float price, Integer amount, String unit, Integer expiredInDays, String flour) {
        super(name, price, amount, unit, expiredInDays);
        this.flour = flour;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    @Override
    public String toString() {
        return super.toString() +
                "flour='" + flour + '\'' +
                ", expiredInDays=" + expiredInDays;
    }
}
