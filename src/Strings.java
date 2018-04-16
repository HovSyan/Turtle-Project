public class Strings {

     static String GREETING_MESSAGE = "You are welcomed by Turtle project Beta version 3.\n" +
            "By default you have one turtle on the board 25x25.\n" +
            "Also by default the turtle is placed on point (5, 5) on the board,\n" +
            "the pen is off, and the head of the turtle is directed to the north.\n" +
            "The commands are:\n" +
            "change head direction\n" +
            "change pen state\n" +
            "move\n" +
            "get board layout\n" +
            "help\n" +
            "exit.";

    static String ASKING_FOR_PEN_STATE = "Please, print \"on\" or \"off\".";

    static String UNEXPECTED_INPUT_APPEARED = "Unexpected input appeared, please try again.";

    static String ASKING_FOR_DIRECTION = "Please, print \"N\", \"E\", \"S\" or \"W\"";

    static String ASKING_FOR_NUMBER_OF_STEPS = "Please, print a positive integer as number of steps you\n" +
                                               "you want your turtle to move.";

    static String OUT_OF_BOARD_EXCEPTION_WAS_HANDELED = "You're gone out of board, try again.";

    static String DONE_MESSAGE = "Done!";

    private Strings() {}
}
