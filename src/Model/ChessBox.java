package Model;

public class ChessBox {
    private ChessColumn chessColumn;
    private int chessRow;
    public ChessBox(ChessColumn chessColumn, int chessRow){
        this.chessColumn = chessColumn;
        this.chessRow = chessRow;
    }

    public ChessColumn getChessColumn() {
        return chessColumn;
    }

    public void setChessColumn(ChessColumn chessColumn) {
        this.chessColumn = chessColumn;
    }

    public int getChessRow() {
        return chessRow;
    }

    public void setChessRow(int chessRow) {
        this.chessRow = chessRow;
    }
}
