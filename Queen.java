import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
    public Queen(char color) {
        super(color);
    }
    public char getType() {
        return 'Q';
    }
    public List<int[]> getMoves(Board board, int row, int col) {
        List<int[]> moves = new ArrayList<>();
        addMoves(board, row, col, NESW, true, moves);
        addMoves(board, row, col, DIAG, true, moves);
        return moves;
    }
}