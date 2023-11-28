public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column)) {
            if ((Math.abs(line - toLine) != Math.abs(column - toColumn)) && (line != toLine || column != toColumn)) {
                return true;
            } else {
                return false;
            }
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
