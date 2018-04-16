public interface TurtleActionService {

    void changeHeadDirection(Turtle turtle, Direction direction);
    void move(Turtle turtle, int steps);
    void changePenState(Turtle turtle ,boolean penState);
}
