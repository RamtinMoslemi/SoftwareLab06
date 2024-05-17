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

    public void changeShippingStrategy(Strategy strategy) {
        this.strategy = strategy;
        if (instance.strategy == Strategy.normal)
            cost = weight * 2.5f;
        else
            cost = weight * 3.5f;
        System.out.println(">>>>>Shippint cost: $%.1f", cost);
        printInfo();
    }

    public void updatePackageState(Strategy state) {
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