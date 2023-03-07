public class Goods{
    private String name;
    private Float price = 0.0F ;
    private Integer amount = 0;
    private String unit;

    Goods(String name, String unit){
        this.name = name;
        this.unit = unit;
    }
    Goods(String name, Integer amount, String unit){
        this(name, unit);
        this.amount = amount;
    }
    Goods(String name, Float price, Integer amount, String unit){
        this(name, amount, unit);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", unit='" + unit + '\'';

    }
}




