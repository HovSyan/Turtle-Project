import java.util.Scanner;

public class IOControlerImplementation implements IOControler {

    public IOControlerImplementation() {
        stdIn = new Scanner(System.in);
    }

    public String getInputFromConsole() {
        String s = stdIn.nextLine();
        return s;
    }

    public void printToConsole(String s) {
        System.out.println(s);
    }

    private Scanner stdIn;
}
