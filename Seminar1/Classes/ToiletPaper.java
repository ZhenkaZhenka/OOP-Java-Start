public class ToiletPaper extends Hygiene{
    Integer layers;

    public ToiletPaper(String name, String unit, Integer amountInPack, Integer layers) {
        super(name, unit, amountInPack);
        this.layers = layers;
    }

    public ToiletPaper(String name, Integer amount, String unit, Integer amountInPack, Integer layers) {
        super(name, amount, unit, amountInPack);
        this.layers = layers;
    }

    public ToiletPaper(String name, Float price, Integer amount, String unit, Integer amountInPack, Integer layers) {
        super(name, price, amount, unit, amountInPack);
        this.layers = layers;
    }

    public Integer getLayers() {
        return layers;
    }

    public void setLayers(Integer layers) {
        this.layers = layers;
    }

    @Override
    public String toString() {
        return super.toString() +
                "layers=" + layers +
                ", amountInPack=" + amountInPack;
    }
}
