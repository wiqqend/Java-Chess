import java.util.ArrayList;
import java.util.List;
public class Rook extends Piece {
    public Rook(char color) {
        super(color);
    }
    public char getType() {
        return 'R';
    }
    public List<int[]> getMoves(Board board, int row, int col) {
        List<int[]> moves = new ArrayList<>();
        addMoves(board, row, col, NESW, true, moves);
        return moves;
    }
}