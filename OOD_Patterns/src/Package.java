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

    public void setState() {

    }

    public void setStrategy() {

    }

    public void setWeight() {

    }

    public void changeShippingStrategy() {

    }

    public void updatePackageState() {

    }

    public void onDeliver() {

    }

    public void printInfo() {

    }
}