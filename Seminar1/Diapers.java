class Diapers extends ChildGoods{
    Integer size;
    Integer minWeight;
    Integer maxWeight;
    String type;

    public Diapers(String name, String unit, boolean hypoallergenic, Integer size, String type) {
        super(name, unit, hypoallergenic);
        this.size = size;
        this.type = type;
    }

    public Diapers(String name, Integer amount, String unit, boolean hypoallergenic, Integer size, String type) {
        super(name, amount, unit, hypoallergenic);
        this.size = size;
        this.type = type;
    }

    public Diapers(String name, Float price, Integer amount, String unit, boolean hypoallergenic, Integer size, String type) {
        super(name, price, amount, unit, hypoallergenic);
        this.size = size;
        this.type = type;
    }

    public Diapers(String name, String unit, Integer minAge, boolean hypoallergenic, Integer size, String type) {
        super(name, unit, minAge, hypoallergenic);
        this.size = size;
        this.type = type;
    }

    public Diapers(String name, Integer amount, String unit, Integer minAge, boolean hypoallergenic, Integer size, String type) {
        super(name, amount, unit, minAge, hypoallergenic);
        this.size = size;
        this.type = type;
    }

    public Diapers(String name, Float price, Integer amount, String unit, Integer minAge, boolean hypoallergenic, Integer size, String type) {
        super(name, price, amount, unit, minAge, hypoallergenic);
        this.size = size;
        this.type = type;
    }

    public Diapers(String name, String unit, boolean hypoallergenic, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, unit, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diapers(String name, Integer amount, String unit, boolean hypoallergenic, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, amount, unit, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diapers(String name, Float price, Integer amount, String unit, boolean hypoallergenic, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, amount, unit, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diapers(String name, String unit, Integer minAge, boolean hypoallergenic, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diapers(String name, Integer amount, String unit, Integer minAge, boolean hypoallergenic, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, amount, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public Diapers(String name, Float price, Integer amount, String unit, Integer minAge, boolean hypoallergenic, Integer size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, amount, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }
}
