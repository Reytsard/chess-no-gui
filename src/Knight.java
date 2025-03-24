import java.util.ArrayList;

public class Knight extends ChessPiece {
    public Knight(ChessSide side) {
        super(side, ChessType.KNIGHT);
    }

    @Override
    void move(ArrayList<ChessBox> possibleMoves, ChessBox from, ChessBox to) {
        if (possibleMoves.contains(to)) {
            to.piece = this;
            from.piece = null;
        }
    }

    @Override
    ArrayList<ChessBox> getPossibleMoves(Chessboard chessboard, ChessBox currentPosition) {
        ArrayList<ChessBox> possibleMoves = new ArrayList<>();
        try {
            ChessBox possibleMove1 = chessboard.chessboard[currentPosition.getRow() + 2][currentPosition.getCol() + 1];
            possibleMoves.add(possibleMove1);
        } catch (IndexOutOfBoundsException _) {

        }
        try {
            ChessBox possibleMove2 = chessboard.chessboard[currentPosition.getRow() + 2][currentPosition.getCol() - 1];
            possibleMoves.add(possibleMove2);
        } catch (IndexOutOfBoundsException _) {

        }
        try {
            ChessBox possibleMove3 = chessboard.chessboard[currentPosition.getRow() - 2][currentPosition.getCol() - 1];
            possibleMoves.add(possibleMove3);
        } catch (IndexOutOfBoundsException _) {

        }
        try {
            ChessBox possibleMove4 = chessboard.chessboard[currentPosition.getRow() - 2][currentPosition.getCol() + 1];
            possibleMoves.add(possibleMove4);
        } catch (IndexOutOfBoundsException _) {

        }
        try {
            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() - 1][currentPosition.getCol() + 2];
            possibleMoves.add(possibleMove);
        } catch (IndexOutOfBoundsException _) {

        }
        try {
            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() - 1][currentPosition.getCol() - 2];
            possibleMoves.add(possibleMove);
        } catch (IndexOutOfBoundsException _) {

        }
        try {
            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() + 1][currentPosition.getCol() + 2];

            possibleMoves.add(possibleMove);
        } catch (IndexOutOfBoundsException _) {

        }
        try {
            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() + 1][currentPosition.getCol() - 2];
            possibleMoves.add(possibleMove);
        } catch (IndexOutOfBoundsException _) {

        }

        return possibleMoves;
    }

    @Override
    ChessPiece capture(Chessboard chessboard, ChessBox boxToCapture) {
        if(boxToCapture.piece != null){
            return boxToCapture.piece;
        }
        return null;
    }
}
