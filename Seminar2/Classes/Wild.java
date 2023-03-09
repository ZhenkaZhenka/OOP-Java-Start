package Classes;

public abstract class Wild extends Animal {
    String livingEnvironment;
    String dateOfFinding;

    public Wild(Float height, Float weight, String colorOfEyes, String livingEnvironment, String dateOfFinding) {
        super(height, weight, colorOfEyes);
        this.livingEnvironment = livingEnvironment;
        this.dateOfFinding = dateOfFinding;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public String getDateOfFinding() {
        return dateOfFinding;
    }

    public void setDateOfFinding(String dateOfFinding) {
        this.dateOfFinding = dateOfFinding;
    }
}
