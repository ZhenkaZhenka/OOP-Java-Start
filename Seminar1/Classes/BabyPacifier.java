public class BabyPacifier extends ChildGoods {
        public BabyPacifier(String name, String unit, boolean hypoallergenic) {
            super(name, unit, hypoallergenic);
        }

        public BabyPacifier(String name, Integer amount, String unit, boolean hypoallergenic) {
            super(name, amount, unit, hypoallergenic);
        }

        public BabyPacifier(String name, Float price, Integer amount, String unit, boolean hypoallergenic) {
            super(name, price, amount, unit, hypoallergenic);
        }

        public BabyPacifier(String name, String unit, Integer minAge, boolean hypoallergenic) {
            super(name, unit, minAge, hypoallergenic);
        }

        public BabyPacifier(String name, Integer amount, String unit, Integer minAge, boolean hypoallergenic) {
            super(name, amount, unit, minAge, hypoallergenic);
        }

        public BabyPacifier(String name, Float price, Integer amount, String unit, Integer minAge, boolean hypoallergenic) {
            super(name, price, amount, unit, minAge, hypoallergenic);
        }

    @Override
    public String toString() {
        return "BabyPacifier{" +
                "minAge=" + minAge +
                ", hypoallergenic=" + hypoallergenic +
                "} " + super.toString();
    }
}

