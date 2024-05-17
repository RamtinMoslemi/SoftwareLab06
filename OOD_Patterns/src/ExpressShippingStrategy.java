public class ExpressShippingStrategy implements ShippingStrategy {
    @Override
    public void cost(float weight) {
        System.out.printf(">>>>>Shipping cost: $%.1f", weight * 3.5f);
    }
}
