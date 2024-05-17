public class Package {
    private static Package instance;
    private float weight;
    private InfoContext info;
    private PackageStateContext state;
    private ShippingContext strategy;

    public Package(float weight) {
        instance.weight = weight;
        instance.info = new InfoContext();
        instance.state = new PackageStateContext(new TransitionState());
        instance.strategy = new ShippingContext();
    }

    public void changeStrategy(int strategy) {
        if (strategy == 0) {
            instance.strategy.setStrategy(new NormalShippingStrategy());
            instance.info.setState(new NormalInfoState());
        } else {
            instance.strategy.setStrategy(new ExpressShippingStrategy());
            instance.info.setState(new ExpressInfoState());
        }
        instance.strategy.calculateCost(this.weight);
        instance.info.request();
    }

    public void updateState(int state) {
        if (state == 0)
            instance.state.setState(new TransitionState());
        else
            instance.state.setState(new DeliveredState());
        instance.state.request();
    }
}