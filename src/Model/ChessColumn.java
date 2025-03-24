package Model;

public enum ChessColumn {
    A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8);
    final int value;
    ChessColumn(int value){
        this.value = value;
    }
    int getValue(){
        return value;
    }
}
