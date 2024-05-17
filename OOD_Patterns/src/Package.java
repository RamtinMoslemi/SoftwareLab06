enum Strategy {
    normal,
    express
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

    public void setState(State state) {
        instance.state = state;
    }

    public void setStrategy(Strategy strategy) {
        instance.strategy = strategy;
    }

    public void setWeight(float weight) {
        instance.weight = weight;
    }

    public void changeShippingStrategy(Strategy strategy) {
        instance.strategy = strategy;
        if (strategy == Strategy.normal)
            cost = weight * 2.5f;
        else
            cost = weight * 3.5f;
        System.out.println(">>>>>Shippint cost: $%.1f", cost);
    }

    public void updatePackageState(Strategy state) {

    }

    public void onDeliver() {

    }

    public void printInfo() {

    }
}