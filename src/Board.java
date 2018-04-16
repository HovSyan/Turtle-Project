import java.util.ArrayList;

public class Board {

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        boardLayout = new String[height][width];
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                boardLayout[i][j] = ".";
            }
        }
        objectsOnBoard = new ArrayList<>();
    }

    public String toString() {
        String s;

        s = "";
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                s += boardLayout[i][j];
            }
            s += "\n";
        }

        return s;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String[][] getBoardLayout() { return boardLayout; }

    public void setBoardLayout(String[][] boardLayout) { this.boardLayout = boardLayout; }

    private ArrayList<Object> objectsOnBoard;
    private String[][] boardLayout;
    private int height;
    private int width;
}
