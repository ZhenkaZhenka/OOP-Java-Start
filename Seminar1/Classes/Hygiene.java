public class Hygiene extends Goods {
    Integer amountInPack;

    public Hygiene(String name, String unit, Integer amountInPack) {
        super(name, unit);
        this.amountInPack = amountInPack;
    }

    public Hygiene(String name, Integer amount, String unit, Integer amountInPack) {
        super(name, amount, unit);
        this.amountInPack = amountInPack;
    }

    public Hygiene(String name, Float price, Integer amount, String unit, Integer amountInPack) {
        super(name, price, amount, unit);
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
                "amountInPack=" + amountInPack;
    }
}