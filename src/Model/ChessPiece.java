package Model;

public abstract class ChessPiece {
    private ChessType chessType;
    private ChessBox chessBox;

    public ChessPiece(ChessType chessType, ChessBox chessBox) {
        this.chessType = chessType;
        this.chessBox = chessBox;
    }

    abstract void move();

    abstract ChessPiece capture();

    public ChessType getChessType() {
        return chessType;
    }

    public void setChessType(ChessType chessType) {
        this.chessType = chessType;
    }

    public ChessBox getChessBox() {
        return chessBox;
    }

    public void setChessBox(ChessBox chessBox) {
        this.chessBox = chessBox;
    }
}
