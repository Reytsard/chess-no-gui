import java.util.ArrayList;

public class Bishop extends ChessPiece{
    public Bishop(ChessSide side) {
        super(side, ChessType.BISHOP);
    }

    @Override
    void move(ArrayList<ChessBox> possibleMoves, ChessBox from, ChessBox to) {
        if(possibleMoves.contains(to)){
            to.piece = this;
            from.piece = null;
        }
    }

    @Override
    ArrayList<ChessBox> getPossibleMoves(Chessboard chessboard, ChessBox currentPosition) {
        ArrayList<ChessBox> possibleMoves = new ArrayList<>();
        //lower left
        try{
            for (int i = currentPosition.getCol() - 1; i >= 0; i--) {
                    ChessBox possibleMove = chessboard.chessboard[i][i];
                if(possibleMove.piece == null){
                    possibleMoves.add(possibleMove);
                }
                if(possibleMove.piece != null){
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        }catch (IndexOutOfBoundsException _){
        }
        //upperright
        try{
            for (int i = currentPosition.getCol() + 1; i <= 8; i++) {
                ChessBox possibleMove = chessboard.chessboard[i][i];
                if(possibleMove.piece == null){
                    possibleMoves.add(possibleMove);
                }
                if(possibleMove.piece != null){
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        }catch (IndexOutOfBoundsException _){
        }

        //upperleft
        try{
            for (int i = currentPosition.getCol() - 1; i >=0 ; i--) {
                ChessBox possibleMove = chessboard.chessboard[i][currentPosition.getCol()+i];
                if(possibleMove.piece == null){
                    possibleMoves.add(possibleMove);
                }
                if(possibleMove.piece != null){
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        }catch (IndexOutOfBoundsException _){
        }
        //lower right
        try{
            for (int i = currentPosition.getCol() + 1; i <= 8 ; i++) {
                ChessBox possibleMove = chessboard.chessboard[currentPosition.getRow()+i][i];
                if(possibleMove.piece == null){
                    possibleMoves.add(possibleMove);
                }
                if(possibleMove.piece != null){
                    possibleMoves.add(possibleMove);
                    break;
                }
            }
        }catch (IndexOutOfBoundsException _){
        }
        return possibleMoves;
    }

    @Override
    ChessPiece capture(Chessboard chessboard, ChessBox boxToCapture) {
        return null;
    }
}
