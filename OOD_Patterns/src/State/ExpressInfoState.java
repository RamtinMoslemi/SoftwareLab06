package State;

public class ExpressInfoState implements InfoState {
    @Override
    public void handleRequest() {
        System.out.println("We are in express speed! And state is in transition.");
    }
}
