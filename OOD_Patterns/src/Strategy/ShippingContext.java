package Strategy;

public class ShippingContext {
    private ShippingStrategy shippingStrategy;

    public void setStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateCost(float weight) {
        return shippingStrategy.getCost(weight);
    }
}
