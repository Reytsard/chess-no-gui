package Model;

public class Rook extends ChessPiece{
    public Rook(){
        super(ChessType.ROOK);
    }
    @Override
    void move(ChessBox from, ChessBox to) throws MoveOutOfBoundsException {
        if(from.getChessRow() == to.getChessRow()){
            if(to.getChessRow() > 8 || to.getChessRow() < 0){
                throw new MoveOutOfBoundsException();
            }else{
                to.setPiece(this);
            }
        } else if (from.getChessColumn().getValue() == to.getChessColumn().getValue()) {
             if(to.getChessColumn().getValue() > 8 || to.getChessColumn().getValue() < 0){
                 throw new MoveOutOfBoundsException();
             }else{
                 to.setPiece(this);
             }
        }
    }

    @Override
    ChessPiece capture(ChessBox boxToCapture) {
//        if (boxToCapture.)
        return null;
    }
}
