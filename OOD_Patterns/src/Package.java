enum Strategy {
    Standard,
    Express
}

enum State {
    in-transit,
    delivered
}

public class Package {
    private Package instance;
    private State state;
    private Strategy strategy;
    private float weight;

    public static Package Instance() {
        return instance;
    }

    public void setState(enum state) {
        instance.state = state;
    }

    public void setStrategy(enum strategy) {
        instance.strategy = strategy;
    }

    public void setWeight(float weight) {
        instance.weight = weight;
    }

    public void changeShippingStrategy(enum strategy) {

    }

    public void updatePackageState() {

    }

    public void onDeliver() {

    }

    public void printInfo() {

    }
}