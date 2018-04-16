public class BoardServiceImplementation implements BoardService {

    public void drawLine(Board board, Point start, Direction direction, int steps) {
        String[][] boardLayout;

        boardLayout = board.getBoardLayout();
        switch (direction) {
            case NORTH: {
                for (int i = 1; i <= steps; i++) {
                    boardLayout[board.getHeight() - start.getY() - 1 - i][start.getX()] = "|";
                }
                break;
            }
            case SOUTH: {
                for (int i = 1; i <= steps; i++) {
                    boardLayout[board.getHeight() - start.getY() - 1 + i][start.getX()] = "|";
                }
                break;
            }
            case EAST: {
                for (int i = 1; i <= steps; i++) {
                    boardLayout[board.getHeight() - start.getY() - 1][start.getX() + i] = "-";
                }
                break;
            }
            case WEST: {
                for (int i = 1; i <= steps; i++) {
                    boardLayout[board.getHeight() - start.getY() - 1][start.getX() - i] = "-";
                }
                break;
            }
        }

        board.setBoardLayout(boardLayout);
    }
}
