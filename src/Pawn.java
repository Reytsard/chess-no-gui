import java.util.ArrayList;

public class Pawn extends ChessPiece{
    boolean isFirstMove;
    public Pawn(ChessSide side) {
        super(side, ChessType.PAWN);
        isFirstMove  = true;
    }

    @Override
    void move(ArrayList<ChessBox> possibleMoves, ChessBox to) {
    }

    @Override
    ArrayList<ChessBox> getPossibleMoves(Chessboard chessboard) {
        ArrayList<ChessBox> possibleMoves = new ArrayList<>();
        //add implementation for possible captures
        return possibleMoves;
    }

    @Override
    ChessPiece capture(Chessboard chessboard, ChessBox boxToCapture) {
        return null;
    }
}
