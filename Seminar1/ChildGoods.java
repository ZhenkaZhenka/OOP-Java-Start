class ChildGoods extends Goods {
    Integer minAge;
    boolean hypoallergenic;

    public ChildGoods(String name, String unit, boolean hypoallergenic) {
        super(name, unit);
        this.hypoallergenic = hypoallergenic;
    }

    public ChildGoods(String name, Integer amount, String unit, boolean hypoallergenic) {
        super(name, amount, unit);
        this.hypoallergenic = hypoallergenic;
    }

    public ChildGoods(String name, Float price, Integer amount, String unit, boolean hypoallergenic) {
        super(name, price, amount, unit);
        this.hypoallergenic = hypoallergenic;
    }

    public ChildGoods(String name, String unit, Integer minAge, boolean hypoallergenic) {
        super(name, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public ChildGoods(String name, Integer amount, String unit, Integer minAge, boolean hypoallergenic) {
        super(name, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public ChildGoods(String name, Float price, Integer amount, String unit, Integer minAge, boolean hypoallergenic) {
        super(name, price, amount, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }
}