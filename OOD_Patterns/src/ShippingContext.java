public class ShippingContext {
    private ShippingStrategy shippingStrategy;

    public void setStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void calculateCost(float weight) {
        shippingStrategy.cost(weight);
    }
}
