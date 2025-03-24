public class Chessboard {
    ChessBox[][] chessboard;

    public Chessboard() {
        initBoard();
    }

    private void initBoard() {
        chessboard = new ChessBox[8][8];
        chessboard[0] = setUpBlackPieces(0);
        chessboard[1] = setUpBlackPawnPieces(1);
        chessboard[2] = setUpBlankChessBox(2);
        chessboard[3] = setUpBlankChessBox(3);
        chessboard[4] = setUpBlankChessBox(4);
        chessboard[5] = setUpBlankChessBox(5);
        chessboard[6] = setUpWhitePawnPieces(6);
        chessboard[7] = setUpWhitePieces(7);
    }

    private ChessBox[] setUpWhitePawnPieces(int col) {
        ChessBox[] row = new ChessBox[8];
        for (int i = 0; i < row.length; i++) {
            Pawn pawn = new Pawn(ChessSide.BLACK);
            row[i] = new ChessBox(col, i, pawn);
        }
        return row;
    }

    private ChessBox[] setUpBlackPawnPieces(int col) {
        ChessBox[] row = new ChessBox[8];
        for (int i = 0; i < row.length; i++) {
            Pawn pawn = new Pawn(ChessSide.BLACK);
            row[i] = new ChessBox(col, i, pawn);
        }
        return row;
    }

    private ChessBox[] setUpBlankChessBox(int col) {
        ChessBox[] row = new ChessBox[8];
        for (int i = 0; i < row.length; i++) {
            row[i] = new ChessBox(col, i);
        }
        return row;
    }
}
