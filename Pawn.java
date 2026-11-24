import java.util.List;

public class Pawn extends Piece {
    public Pawn(char color) { 
        super(color); 
    }
    public char getType() {
        return 'P';
    }
    public List<int[]> getMoves(Board board, int row, int col) {
    
    }
    public List<int[]> getAttacks(Board board, int row, int col) {
    
    }
}
