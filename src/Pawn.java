public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(line == 1 && color=="White" && toColumn == column +2){
            return true;
        }else if (line == 6 && color =="Black" && toColumn == column +2){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
