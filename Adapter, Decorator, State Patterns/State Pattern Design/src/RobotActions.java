public class RobotActions implements Robot {
    private Robot State;

    public void setState(Robot state) {
        this.State = state;
    }

    public Robot getState() {
        return this.State;
    }

    @Override
    public void happy() {
        this.State.happy();
    }

    @Override
    public void boring() {
        this.State.boring();
    }

}
