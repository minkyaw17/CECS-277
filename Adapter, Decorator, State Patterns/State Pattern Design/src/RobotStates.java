public class RobotStates implements Robot {
    @Override
    public void happy() {
        System.out.println("Robot is happy :)");
        System.out.println("Robot talks");
        System.out.println("Robot cooks");
    }

    @Override
    public void boring() {
        System.out.println("Robot is boring :|");
        System.out.println("Robot sings");
        System.out.println("Robot is going back in to happy state :)");
        happy();
    }
}
