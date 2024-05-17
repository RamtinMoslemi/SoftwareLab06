package State;

public class DeliveredState implements PackageState {
    @Override
    public void handleRequest() {
        System.out.println("Package has been delivered");
        System.exit(0);
    }
}
