public class Eggs extends Food{
    Integer amountInPack;

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
}
