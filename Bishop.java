import java.util.ArrayList;
import java.util.List;
public class Bishop extends Piece {
    public Bishop(char color) {
        super(color);
    }
    public char getType() {
        return 'B';
    }
    public List<int[]> getMoves(Board board, int row, int col) {
        List<int[]> moves = new ArrayList<>();
        addMoves(board, row, col, DIAG, true, moves);
        return moves;
    }
}