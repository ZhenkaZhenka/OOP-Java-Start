public class Milk extends Drink{
    Float fatContent = 0F;
    Integer expiredInDays = 0;

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

    public Float getFatContent() {
        return fatContent;
    }

    public void setFatContent(Float fatContent) {
        this.fatContent = fatContent;
    }

    public Integer getExpiredInDays() {
        return expiredInDays;
    }

    public void setExpiredInDays(Integer expiredInDays) {
        this.expiredInDays = expiredInDays;
    }

    @Override
    public String toString() {
        return super.toString() +
                "fatContent=" + fatContent +
                ", expiredInDays=" + expiredInDays +
                ", volumeInLitres=" + volumeInLitres;
    }
}
