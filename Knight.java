import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece{
    public Knight(char color) { 
        super(color); 
    }
    private static final int[][] JUMPS = {
        {2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
    };
    public char getType() {
        return 'N';
    }
    public List<int[]> getMoves(Board board, int row, int col) {
        List<int[]> moves = new ArrayList<>();
        addMoves(board, row, col, JUMPS, false, moves);
        return moves;
    }
}
