public class Diapers extends ChildGoods{
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "size=" + size +
                ", minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                ", type='" + type + '\'' +
                ", minAge=" + minAge +
                ", hypoallergenic=" + hypoallergenic;
    }
}


