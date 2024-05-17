package State;

public class NormalInfoState implements InfoState {
    @Override
    public void handleRequest() {
        System.out.println("We are in normal speed! And state is in transition.");
    }
}
