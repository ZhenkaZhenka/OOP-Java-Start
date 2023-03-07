public class Masks extends Hygiene{
    public Masks(String name, String unit, Integer amountInPack) {
        super(name, unit, amountInPack);
    }

    public Masks(String name, Integer amount, String unit, Integer amountInPack) {
        super(name, amount, unit, amountInPack);
    }

    public Masks(String name, Float price, Integer amount, String unit, Integer amountInPack) {
        super(name, price, amount, unit, amountInPack);
    }


    @Override
    public String toString() {
        return "Masks{" +
                "amountInPack=" + amountInPack +
                "} " + super.toString();
    }



    }

