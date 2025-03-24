package Model;

public class ChessBox {
    private ChessColumn chessColumn;
    private int chessRow;
    private ChessPiece piece;
    public ChessBox(ChessColumn chessColumn, int chessRow, ChessPiece piece){
        this.chessColumn = chessColumn;
        this.chessRow = chessRow;
        this.piece = piece;
    }

    public ChessPiece getPiece(){
        return piece;
    }
    public void setPiece(ChessPiece piece){
        this.piece = piece;
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
