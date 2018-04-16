public interface UserActionService {
    void changeTurtleHeadDirection(Turtle turtle, Direction direction);
    void moveTurtle(Turtle turtle, Board board, int steps) throws ArrayIndexOutOfBoundsException;
    void changeTurtlePenState(Turtle turtle, boolean penState);
    void getBoardLayout(Board board);
}
