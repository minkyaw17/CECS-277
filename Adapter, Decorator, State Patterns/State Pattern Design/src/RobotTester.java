public class RobotTester {
    public static void main(String [] args) {
        RobotActions RobActions = new RobotActions();
        RobotStates RobStates = new RobotStates();

        RobActions.setState(RobStates);
        RobActions.happy();

        RobActions.setState(RobStates);
        RobActions.boring();
    }
}
