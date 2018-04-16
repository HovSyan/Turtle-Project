public class Turtle {

    public Turtle(String name) {
        this.name = name;
        penState = false;
        headDirection = Direction.NORTH;
        currentPosition = new Point(0, 0);
    }

    public String toString() {
        return "Turtle" + name;
    }

    public Direction getHeadDirection() {
        return headDirection;
    }

    public void setHeadDirection(Direction newHeadDirection) {
        this.headDirection = newHeadDirection;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point newCurrentPosition) {
        this.currentPosition = newCurrentPosition;
    }

    public boolean getPenState() {
        return penState;
    }

    public void setPenState(boolean penState) {
        this.penState = penState;
    }

    private String name;
    private boolean penState;
    private Direction headDirection;
    private Point currentPosition;
}
