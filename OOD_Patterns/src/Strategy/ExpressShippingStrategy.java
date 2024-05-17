package Strategy;

public class ExpressShippingStrategy implements ShippingStrategy {
    @Override
    public double cost(float weight) {
        System.out.printf(">>>>>Shipping cost: $%.1f", weight * 3.5f);
        return weight * 3.5;
    }
}