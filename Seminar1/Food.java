class Food extends Goods {
    Integer expiredInDays;

    public Food(String name, String unit, Integer expiredInDays) {
        super(name, unit);
        this.expiredInDays = expiredInDays;
    }

    public Food(String name, Integer amount, String unit, Integer expiredInDays) {
        super(name, amount, unit);
        this.expiredInDays = expiredInDays;
    }

    public Food(String name, Float price, Integer amount, String unit, Integer expiredInDays) {
        super(name, price, amount, unit);
        this.expiredInDays = expiredInDays;
    }
}