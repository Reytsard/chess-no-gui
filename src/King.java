import java.util.ArrayList;

public class King extends ChessPiece {
    public King(ChessSide side) {
        super(side, ChessType.KING);
    }

    @Override
    void move(ArrayList<ChessBox> possibleMoves, ChessBox from, ChessBox to) {

    }

    @Override
    ArrayList<ChessBox> getPossibleMoves(Chessboard chessboard, ChessBox currentPosition) {
        ArrayList<ChessBox> possibleMoves = new ArrayList<>();
        try {
            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() + 1][currentPosition.getCol()];
            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        try {

            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() + 1][currentPosition.getCol() - 1];

            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        try {


            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() + 1][currentPosition.getCol() + 1];

            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        try {


            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() - 1][currentPosition.getCol()];
            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        try {


            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() - 1][currentPosition.getCol() - 1];
            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        try {


            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() - 1][currentPosition.getCol() + 1];
            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        try {


            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow()][currentPosition.getCol() + 1];
            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        try {


            ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow()][currentPosition.getCol() - 1];
            if (possibleMove.piece == null) {
                possibleMoves.add(possibleMove);
            }
        } catch (IndexOutOfBoundsException _) {

        }
        return possibleMoves;
    }

    @Override
    ChessPiece capture(Chessboard chessboard, ChessBox boxToCapture) {
        return null;
    }
}
