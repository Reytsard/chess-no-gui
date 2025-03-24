public class ChessBox {
    int col;
    int row;
    ChessPiece piece;
    public ChessBox(int col, int row){
        this.col = col;
        this.row = row;
        piece = null;
    }
    public ChessBox(int col, int row, ChessPiece piece){
        this.col = col;
        this.row = row;
        this.piece = piece;
    }

    public void setPiece(ChessPiece piece){
        this.piece = piece;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
