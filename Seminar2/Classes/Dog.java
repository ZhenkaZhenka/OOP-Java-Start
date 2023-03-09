package Classes;

public class Dog extends Pet{
    boolean trainable;

    public boolean isTrainable() {
        return trainable;
    }

    private void setTrainable(boolean trainable) {
        this.trainable = trainable;
    }

    public void training(){
        System.out.println("Now your dog can do back-flip");
    }
}
