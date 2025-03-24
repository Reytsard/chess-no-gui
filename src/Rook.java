import java.util.ArrayList;

public class Rook extends ChessPiece {
    public Rook(ChessSide side) {
        super(side, ChessType.ROOK);
    }

    @Override
    void move(ArrayList<ChessBox> possibleMoves,ChessBox from, ChessBox to) {
        if(possibleMoves.contains(to)){
            to.piece = this;
            from.piece = null;
        }
    }

    @Override
    ArrayList<ChessBox> getPossibleMoves(Chessboard chessboard, ChessBox currentPosition) {
        ArrayList<ChessBox> possibleMoves = new ArrayList<>();
        for (int column = currentPosition.getCol() - 1; column >= 0; column--) {
            try {
                ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow()][column];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }

        }
        //rightSide
        for (int col = currentPosition.getCol() + 1; col <= 8; col++) {
            try {
                ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow()][col];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        //forward
        for (int row = currentPosition.getRow() + 1; row <= 8; row++) {
            try {
                ChessBox possibleMove = chessboard.chessboard[row][currentPosition.getCol()];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        //backward
        for (int row = currentPosition.getRow() - 1; row >= 0; row--) {
            try {
                ChessBox possibleMove = chessboard.chessboard[row][currentPosition.getCol()];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return possibleMoves;
    }

    @Override
    ChessPiece capture(Chessboard chessboard, ChessBox boxToCapture) {
        return null;
    }
}
