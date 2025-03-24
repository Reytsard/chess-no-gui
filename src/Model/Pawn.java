package Model;

public class Pawn extends ChessPiece {
    boolean isFirstMove = true;
    ChessSide chessSide;

    public Pawn(ChessBox chessBox, ChessSide chessSide) {
        super(ChessType.PAWN, chessBox);
        this.chessSide = chessSide;
    }

    @Override
    void move(ChessBox from, ChessBox to) {
        switch (chessSide) {
            case ChessSide.WHITE -> {
                int distance = from.getChessRow() - to.getChessRow();
                if (isFirstMove) {
                    if (distance <= 2) {
                        this.setChessBox(to);
                    }
                } else {
                    if (distance == 1) {
                        this.setChessBox(to);
                    }
                }
            }
        }
    }

    @Override
    ChessPiece capture(ChessPiece toCapture) {
        if (this.getChessBox().getChessColumn().getValue() - 1 == toCapture.getChessBox().getChessColumn().getValue()
                || this.getChessBox().getChessColumn().getValue() + 1 == toCapture.getChessBox().getChessColumn().getValue()
        ) {
            return toCapture;
        }
        return null;
    }
}
