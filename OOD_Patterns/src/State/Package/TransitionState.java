package State.Package;

public class TransitionState implements PackageState {
    @Override
    public void handleRequest() {
        System.out.println("Package is in transit");
    }
}
