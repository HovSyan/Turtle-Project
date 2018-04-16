public class TurtleActionServiceImplementation implements TurtleActionService {

    public void changeHeadDirection(Turtle turtle, Direction direction) {
        turtle.setHeadDirection(direction);
    }

    public void move(Turtle turtle, int steps) {
        Direction direction;
        int x;
        int y;

        direction = turtle.getHeadDirection();
        y = turtle.getCurrentPosition().getY();
        x = turtle.getCurrentPosition().getX();
        switch (direction) {
            case NORTH: {
                y += steps;
                break;
            }
            case EAST: {
                x += steps;
                break;
            }
            case WEST: {
                x -= steps;
                break;
            }
            case SOUTH: {
                y -= steps;
                break;
            }
        }

        turtle.setCurrentPosition(new Point(x, y));
    }

    public void changePenState(Turtle turtle, boolean penState) {
        turtle.setPenState(penState);
    }
}
