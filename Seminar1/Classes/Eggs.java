public class Eggs extends Food{
    Integer amountInPack = 0;

    public Eggs(String name, String unit, Integer expiredInDays, Integer amountInPack) {
        super(name, unit, expiredInDays);
        this.amountInPack = amountInPack;
    }

    public Eggs(String name, Integer amount, String unit, Integer expiredInDays, Integer amountInPack) {
        super(name, amount, unit, expiredInDays);
        this.amountInPack = amountInPack;
    }

    public Eggs(String name, Float price, Integer amount, String unit, Integer expiredInDays, Integer amountInPack) {
        super(name, price, amount, unit, expiredInDays);
        this.amountInPack = amountInPack;
    }

    public Integer getAmountInPack() {
        return amountInPack;
    }

    public void setAmountInPack(Integer amountInPack) {
        this.amountInPack = amountInPack;
    }

    @Override
    public String toString() {
        return super.toString() +
                "amountInPack=" + amountInPack +
                ", expiredInDays=" + expiredInDays;
    }
}
