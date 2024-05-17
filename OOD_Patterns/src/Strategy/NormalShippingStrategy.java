package Strategy;

public class NormalShippingStrategy implements ShippingStrategy {
    @Override
    public double cost(float weight) {
        System.out.printf(">>>>>Shipping cost: $%.1f", weight * 2.5f);
        return weight * 2.5;
    }
}
