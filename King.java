import java.util.List;
import java.util.ArrayList;
public class King extends Piece{
    public King(char color) { 
        super(color); 
    }
    public char getType() {
        return 'K';
    }

    public List<int[]> getMoves(Board board, int row, int col) {
        List<int[]> moves = new ArrayList<>();
        addMoves(board, row, col, NESW, true, moves);
        addMoves(board, row, col, DIAG, true, moves);        
        return moves;
    }
}
