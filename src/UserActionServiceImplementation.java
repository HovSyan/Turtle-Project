public class UserActionServiceImplementation implements UserActionService {

    public UserActionServiceImplementation() {
        turtleActionService = new TurtleActionServiceImplementation();
        boardService = new BoardServiceImplementation();
        ioControler = new IOControlerImplementation();
    }

    public void changeTurtleHeadDirection(Turtle turtle, Direction direction) {
        turtleActionService.changeHeadDirection(turtle, direction);
    }

    public void moveTurtle(Turtle turtle, Board board, int steps) throws ArrayIndexOutOfBoundsException {
        Direction direction;
        int x;
        int y;

        direction = turtle.getHeadDirection();
        x = turtle.getCurrentPosition().getX();
        y = turtle.getCurrentPosition().getY();
        switch (direction) {
            case NORTH: {
                if(board.getHeight() - y - 1 - steps < 0) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                break;
            }
            case SOUTH: {
                if(board.getHeight() - y - 1 + steps >= board.getHeight()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                break;
            }
            case WEST: {
                if(x - steps < 0) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                break;
            }
            case EAST: {
                if(x + steps >= board.getWidth()) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                break;
            }
        }

        if(turtle.getPenState()) {
            boardService.drawLine(board, turtle.getCurrentPosition(), direction, steps);
        }

        turtleActionService.move(turtle, steps);
    }

    public void changeTurtlePenState(Turtle turtle, boolean penState) {
        turtleActionService.changePenState(turtle, penState);
    }

    public void getBoardLayout(Board board) {
        String s = board.toString();
        ioControler.printToConsole(s);
    }

    private TurtleActionService turtleActionService;
    private BoardService boardService;
    private IOControler ioControler;
}
