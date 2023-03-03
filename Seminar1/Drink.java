class Drink extends Goods {
    Float volumeInLitres;

    public Drink(String name, String unit, Float volumeInLitres) {
        super(name, unit);
        this.volumeInLitres = volumeInLitres;
    }

    public Drink(String name, Integer amount, String unit, Float volumeInLitres) {
        super(name, amount, unit);
        this.volumeInLitres = volumeInLitres;
    }

    public Drink(String name, Float price, Integer amount, String unit, Float volumeInLitres) {
        super(name, price, amount, unit);
        this.volumeInLitres = volumeInLitres;
    }

}
