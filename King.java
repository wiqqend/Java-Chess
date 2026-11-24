import java.util.List;
import java.util.ArrayList;
public class King extends Piece{
    public King(char color) { 
        super(color); 
    }
    private static final int[][] MOVES = {
        {1, 1}, {1, -1}, {-1, 1}, {-1, -1}, {1,0},{0,1},{-1,0},{0,-1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1},{1,0},{0,1},{-1,0},{0,-1}
    };
    public char getType() {
        return 'K';
    }

    public List<int[]> getMoves(Board board, int row, int col) {
        List<int[]> moves = new ArrayList<>();
        addMoves(board, row, col, MOVES, false, moves);
        return moves;
    }
}
