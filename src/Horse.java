public class Horse extends ChessPiece {


    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line != toLine && column != toColumn && chessBoard.board[line][column] != null) {
            if (!chessBoard.board[line][column].equals(this)) {
                return false;
            }
            //Все позиции коня
            int[][] position = new int[][]{
                    {line - 2, column - 1}, {line - 2, column + 1},
                    {line + 2, column - 1}, {line + 2, column + 1},
                    {line - 1, column - 2}, {line - 1, column + 2},
                    {line + 1, column - 2}, {line + 1, column + 2}
            };
            for (int i = 0; i < position.length; i++) {
                if (position[i][0] == toLine && position[i][1] == toColumn) {
                    return true;
                }
            }

        } else return false;
        return true;

    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
