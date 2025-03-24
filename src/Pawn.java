import java.util.ArrayList;

public class Pawn extends ChessPiece{
    boolean isFirstMove;
    public Pawn(ChessSide side) {
        super(side, ChessType.PAWN);
        isFirstMove  = true;
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
        if(isFirstMove){
            int column = currentPosition.getCol();
            if(this.side == ChessSide.WHITE){
                ChessBox possibleMove1 = chessboard.chessboard[column][currentPosition.getRow()+1];
                ChessBox possibleMove2 = chessboard.chessboard[column][currentPosition.getRow()+2];
                if(possibleMove1.piece == null){
                    possibleMoves.add(possibleMove1);
                    if(possibleMove2.piece == null){
                        possibleMoves.add(possibleMove2);
                    }
                }
                //capture possible move
                ChessBox possibleMove3 = chessboard.chessboard[currentPosition.getCol()-1][currentPosition.getRow()+1];
                ChessBox possibleMove4 = chessboard.chessboard[currentPosition.getCol()+1][currentPosition.getRow()+1];
                if(possibleMove3.piece != null && possibleMove3.piece.side != this.side){
                    possibleMoves.add(possibleMove3);
                }
                if(possibleMove4.piece != null && possibleMove4.piece.side != this.side){
                    possibleMoves.add(possibleMove4);
                }
            }else{
                ChessBox possibleMove1 = chessboard.chessboard[column][currentPosition.getRow()-1];
                ChessBox possibleMove2 = chessboard.chessboard[column][currentPosition.getRow()-2];
                if(possibleMove1.piece == null){
                    possibleMoves.add(possibleMove1);
                    if(possibleMove2.piece == null){
                        possibleMoves.add(possibleMove2);
                    }
                }
                //capture possible move
                ChessBox possibleMove3 = chessboard.chessboard[currentPosition.getCol()-1][currentPosition.getRow()-1];
                ChessBox possibleMove4 = chessboard.chessboard[currentPosition.getCol()+1][currentPosition.getRow()-1];
                if(possibleMove3.piece != null && possibleMove3.piece.side != this.side){
                    possibleMoves.add(possibleMove3);
                }
                if(possibleMove4.piece != null && possibleMove4.piece.side != this.side){
                    possibleMoves.add(possibleMove4);
                }
            }

        }
        //add implementation for possible captures
        return possibleMoves;
    }

    @Override
    ChessPiece capture(Chessboard chessboard, ChessBox boxToCapture) {
        return null;
    }
}
