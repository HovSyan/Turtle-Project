public class Main {
    public static void main(String[] args) {
        int steps;

        String input;
        Turtle turtle;
        Board board;
        IOControler ioControler;
        UserActionService userActionService;

        turtle = new Turtle("Jane");
        turtle.setPenState(false);
        turtle.setCurrentPosition(new Point(5, 5));
        turtle.setHeadDirection(Direction.NORTH);

        board = new Board(25, 25);

        ioControler = new IOControlerImplementation();
        userActionService = new UserActionServiceImplementation();
        ioControler.printToConsole(Strings.GREETING_MESSAGE);
        while(true) {
            input = ioControler.getInputFromConsole();
            input = input.trim();
            input = input.toLowerCase();
            switch (input) {
                case "change pen state": {
                    ioControler.printToConsole(Strings.ASKING_FOR_PEN_STATE);
                    while (true) {
                        input = ioControler.getInputFromConsole();
                        input = input.trim();
                        input = input.toLowerCase();
                        if(input.equals("on")) {
                            userActionService.changeTurtlePenState(turtle, true);
                            ioControler.printToConsole(Strings.DONE_MESSAGE);
                            break;
                        }
                        else if(input.equals("off")) {
                            userActionService.changeTurtlePenState(turtle, false);
                            ioControler.printToConsole(Strings.DONE_MESSAGE);
                            break;
                        }
                        else {
                            ioControler.printToConsole(Strings.UNEXPECTED_INPUT_APPEARED);
                        }
                    }
                    break;
                }
                case "change head direction": {
                    ioControler.printToConsole(Strings.ASKING_FOR_DIRECTION);
                    a:
                    while (true) {
                        input = ioControler.getInputFromConsole();
                        input = input.trim();
                        input = input.toLowerCase();
                        switch (input) {
                            case "n": {
                                userActionService.changeTurtleHeadDirection(turtle, Direction.NORTH);
                                ioControler.printToConsole(Strings.DONE_MESSAGE);
                                break a;
                            }
                            case "s": {
                                userActionService.changeTurtleHeadDirection(turtle, Direction.SOUTH);
                                ioControler.printToConsole(Strings.DONE_MESSAGE);
                                break a;
                            }
                            case "e": {
                                userActionService.changeTurtleHeadDirection(turtle, Direction.EAST);
                                ioControler.printToConsole(Strings.DONE_MESSAGE);
                                break a;
                            }
                            case "w": {
                                userActionService.changeTurtleHeadDirection(turtle, Direction.WEST);
                                ioControler.printToConsole(Strings.DONE_MESSAGE);
                                break a;
                            }
                            default: {
                                ioControler.printToConsole(Strings.UNEXPECTED_INPUT_APPEARED);
                            }
                        }
                    }
                    break;
                }
                case "move": {
                    ioControler.printToConsole(Strings.ASKING_FOR_NUMBER_OF_STEPS);
                    while (true) {
                        input = ioControler.getInputFromConsole();
                        steps = Integer.parseInt(input);
                        try {
                            userActionService.moveTurtle(turtle, board, steps);
                            ioControler.printToConsole(Strings.DONE_MESSAGE);
                            break;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            ioControler.printToConsole(Strings.OUT_OF_BOARD_EXCEPTION_WAS_HANDELED);
                        }
                    }
                    break;
                }
                case "get board layout": {
                    userActionService.getBoardLayout(board);
                    break;
                }
                case "exit": {
                    return;
                }
                case "help": {
                    ioControler.printToConsole(Strings.GREETING_MESSAGE);
                    break;
                }
                default: {
                    ioControler.printToConsole(Strings.UNEXPECTED_INPUT_APPEARED);
                }
            }
        }
    }
}
