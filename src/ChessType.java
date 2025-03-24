public enum ChessType {
    PAWN(1),
    KNIGHT(3),
    BISHOP(3),
    ROOK(5),
    QUEEN(9),
    KING(999);
    final int value;
    ChessType(int value){
        this.value = value;
    }
    int getValue(){
        return value;
    }
}
