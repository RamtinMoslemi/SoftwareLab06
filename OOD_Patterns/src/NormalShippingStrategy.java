public class NormalShippingStrategy implements ShippingStrategy {
    @Override
    public void cost(float weight) {
        System.out.printf(">>>>>Shipping cost: $%.1f", weight * 2.5f);
    }
}
