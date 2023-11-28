public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column)) {
            for (toLine = -1; toLine <= 1; toLine += 2) {
                for (toColumn = -1; toColumn <= 1; toColumn += 2) {
                    if (Math.abs(toLine) + Math.abs(toColumn) == 3) {
                        if (line >= 0 && line < 8 && column >= 0 && column < 8) {
                            return true;
                        }
                        if (toLine >= 0 && toLine < 8 && toColumn >= 0 && toColumn < 8) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
    public boolean checkPos(int pos){
        return pos > 0 && pos <=7;
    }
}
