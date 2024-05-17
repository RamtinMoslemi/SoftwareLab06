public class InfoContext {
    private InfoState state;

    public void setState(InfoState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
