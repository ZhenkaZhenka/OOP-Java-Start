public class Lemonade extends Drink{
    public Lemonade(String name, String unit, Float volumeInLitres) {
        super(name, unit, volumeInLitres);
    }

    public Lemonade(String name, Integer amount, String unit, Float volumeInLitres) {
        super(name, amount, unit, volumeInLitres);
    }

    public Lemonade(String name, Float price, Integer amount, String unit, Float volumeInLitres) {
        super(name, price, amount, unit, volumeInLitres);
    }

    @Override
    public String toString() {
        return "Lemonade{" +
                "volumeInLitres=" + volumeInLitres +
                "} " + super.toString();
    }
}
