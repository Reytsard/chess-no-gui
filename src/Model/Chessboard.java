package Model;

import java.util.ArrayList;

public class Chessboard {
    ArrayList<ArrayList<ChessBox>> chessboard;

    public Chessboard() {
        initChessboard();
    }

    private void initChessboard() {
        ArrayList<ArrayList<ChessBox>> chessboard = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ArrayList<ChessBox> row = new ArrayList<>(8);
            chessboard.add(row);
        }
        this.chessboard = chessboard;
    }
}
