import State.Info.ExpressInfoState;
import State.Info.InfoContext;
import State.Info.NormalInfoState;
import State.Package.DeliveredState;
import State.Package.PackageStateContext;
import State.Package.TransitionState;
import Strategy.ExpressShippingStrategy;
import Strategy.NormalShippingStrategy;
import Strategy.ShippingContext;

public class Package {
    private static Package instance = null;
    private float weight;
    private InfoContext info;
    private PackageStateContext state;
    private ShippingContext strategy;

    private Package(float weight) {
        this.weight = weight;
        this.info = new InfoContext();
        this.state = new PackageStateContext(new TransitionState());
        this.strategy = new ShippingContext();
    }

    public static Package init(float weight) {
        if (instance != null) {
            instance.weight = weight;
        } else {
            instance = new Package(weight);
        }
        return instance;
    }

    public void changeStrategy(int strategy) {
        if (strategy == 0) {
            this.strategy.setStrategy(new NormalShippingStrategy());
            this.info.setState(new NormalInfoState());
        } else {
            this.strategy.setStrategy(new ExpressShippingStrategy());
            this.info.setState(new ExpressInfoState());
        }
        this.strategy.calculateCost(this.weight);
        this.info.request();
    }

    public void updateState(int state) {
        if (state == 0)
            this.state.setState(new TransitionState());
        else
            this.state.setState(new DeliveredState());
        this.state.request();
    }

    public static synchronized Package getInstance() {
        return instance;
    }

    public double getCost() {
        return this.strategy.calculateCost(this.weight);
    }
}