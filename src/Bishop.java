public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (line < 0 || line >= 8 || column < 0 || column >= 8) {
            return false;
        }
        if (toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }
        return (line + column) % 2 != (toLine + toColumn) % 2;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
