import java.util.ArrayList;

public class Queen extends ChessPiece {
    public Queen(ChessSide side) {
        super(side, ChessType.QUEEN);
    }

    @Override
    void move(ArrayList<ChessBox> possibleMoves, ChessBox from, ChessBox to) {

    }

    @Override
    ArrayList<ChessBox> getPossibleMoves(Chessboard chessboard, ChessBox currentPosition) {
        ArrayList<ChessBox> possibleMoves = new ArrayList<>();
        //lower left
        try {
            for (int i = currentPosition.getCol() - 1; i >= 0; i--) {
                ChessBox possibleMove = chessboard.chessboard[i][i];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        } catch (IndexOutOfBoundsException _) {
        }
        //upperright
        try {
            for (int i = currentPosition.getCol() + 1; i <= 8; i++) {
                ChessBox possibleMove = chessboard.chessboard[i][i];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        } catch (IndexOutOfBoundsException _) {
        }

        //upperleft
        try {
            for (int i = currentPosition.getCol() - 1; i >= 0; i--) {
                ChessBox possibleMove = chessboard.chessboard[i][currentPosition.getCol() + i];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        } catch (IndexOutOfBoundsException _) {
        }
        //lower right
        try {
            for (int i = currentPosition.getCol() + 1; i <= 8; i++) {
                ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow() + i][i];
                if (possibleMove.piece == null) {
                    possibleMoves.add(possibleMove);
                }
                if (possibleMove.piece != null) {
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        } catch (IndexOutOfBoundsException _) {
        }
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
