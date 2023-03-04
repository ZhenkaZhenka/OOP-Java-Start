class Milk extends Drink{
    Float fatContent;
    Integer expiredInDays;

    public Milk(String name, String unit, Float volumeInLitres, Float fatContent, Integer expiredInDays) {
        super(name, unit, volumeInLitres);
        this.fatContent = fatContent;
        this.expiredInDays = expiredInDays;
    }

    public Milk(String name, Integer amount, String unit, Float volumeInLitres, Float fatContent, Integer expiredInDays) {
        super(name, amount, unit, volumeInLitres);
        this.fatContent = fatContent;
        this.expiredInDays = expiredInDays;
    }

    public Milk(String name, Float price, Integer amount, String unit, Float volumeInLitres, Float fatContent, Integer expiredInDays) {
        super(name, price, amount, unit, volumeInLitres);
        this.fatContent = fatContent;
        this.expiredInDays = expiredInDays;
    }

    public Milk(String name, String unit, Float volumeInLitres, Float fatContent) {
        super(name, unit, volumeInLitres);
        this.fatContent = fatContent;
    }

    public Milk(String name, Integer amount, String unit, Float volumeInLitres, Float fatContent) {
        super(name, amount, unit, volumeInLitres);
        this.fatContent = fatContent;
    }

    public Milk(String name, Float price, Integer amount, String unit, Float volumeInLitres, Float fatContent) {
        super(name, price, amount, unit, volumeInLitres);
        this.fatContent = fatContent;
    }

    public Milk(String name, String unit, Float volumeInLitres, Integer expiredInDays) {
        super(name, unit, volumeInLitres);
        this.expiredInDays = expiredInDays;
    }

    public Milk(String name, Integer amount, String unit, Float volumeInLitres, Integer expiredInDays) {
        super(name, amount, unit, volumeInLitres);
        this.expiredInDays = expiredInDays;
    }

    public Milk(String name, Float price, Integer amount, String unit, Float volumeInLitres, Integer expiredInDays) {
        super(name, price, amount, unit, volumeInLitres);
        this.expiredInDays = expiredInDays;
    }
}
