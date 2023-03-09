package Classes;

public abstract class Wild extends Animal {
    String livingEnvironment;
    String dateOfFinding;

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
