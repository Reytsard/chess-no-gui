import java.util.ArrayList;

public abstract class ChessPiece {
    ChessSide side;
    ChessType type;
    public ChessPiece(ChessSide side, ChessType type){
        this.side = side;
        this.type = type;
    }
    abstract void move(ArrayList<ChessBox> possibleMoves, ChessBox from, ChessBox to);
    abstract ArrayList<ChessBox> getPossibleMoves(Chessboard chessboard, ChessBox currentPosition);
    abstract ChessPiece capture(Chessboard chessboard, ChessBox boxToCapture);

    public ChessSide getSide() {
        return side;
    }

    public void setSide(ChessSide side) {
        this.side = side;
    }

    public ChessType getType() {
        return type;
    }

    public void setType(ChessType type) {
        this.type = type;
    }
}
