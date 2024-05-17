package State;

public class PackageStateContext {
    private PackageState state;

    public PackageStateContext(PackageState state) {
        this.state = state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}

