package Model;

public abstract class ChessPiece {
    private ChessType chessType;

    public ChessPiece(ChessType chessType) {
        this.chessType = chessType;
    }

    abstract void move(ChessBox from, ChessBox to) throws MoveOutOfBoundsException;

    abstract ChessPiece capture(ChessBox boxToCapture);

    public ChessType getChessType() {
        return chessType;
    }

    public void setChessType(ChessType chessType) {
        this.chessType = chessType;
    }

}
