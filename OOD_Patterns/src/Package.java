enum Strategy {
    normal,
    express
}

enum State {
    transition,
    delivered
}

public class Package {
    private static Package instance = new Package();
    private State state;
    private Strategy strategy;
    private float weight;
    private float cost;

    private Package() {
        // Private constructor to prevent instantiation
    }

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

    public State getState() {
        return instance.state;
    }

    public Strategy getStrategy() {
        return instance.strategy;
    }

    public float getCost() {
        if (instance.strategy == Strategy.normal)
            return weight * 2.5f;
        else
            return weight * 3.5f;
    }

    public void changeShippingStrategy(Strategy strategy) {
        this.strategy = strategy;
        System.out.printf(">>>>>Shippint cost: $%.1f\n", getCost());
        printInfo();
    }

    public void updatePackageState(State state) {
        this.state = state;
        if (this.state == State.transition) {
            System.out.println("Package is in transit");
            printInfo();
        } else {
            System.out.println("Package has been delivered");
            System.exit(0);
        }
    }

    public void printInfo() {
        System.out.println("We are in " + instance.strategy + " speed! And state is in " + instance.state + ".");
    }
}