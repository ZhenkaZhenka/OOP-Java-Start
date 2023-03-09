package Classes;

public class Wolf extends Wild{
    boolean chief;

    public Wolf(Float height, Float weight, String colorOfEyes, String livingEnvironment,
                String dateOfFinding, boolean chief) {
        super(height, weight, colorOfEyes, livingEnvironment, dateOfFinding);
        this.chief = chief;
    }

    public boolean isChief() {
        return chief;
    }

    private void setChief(boolean chief) {
        this.chief = chief;
    }
}
