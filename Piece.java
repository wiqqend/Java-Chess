import java.util.List;

public abstract class Piece {
    protected static final int[][] NESW = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    protected static final int[][] DIAG = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    protected final char color;
    protected boolean hasMoved = false;

    protected Piece(char color) {
        this.color = color;
    }

     public static Piece create(char color, char type) {
        switch (type) {
            case 'K': return new King(color);
            case 'Q': return new Queen(color);
            case 'R': return new Rook(color);
            case 'B': return new Bishop(color);
            case 'N': return new Knight(color);
            default:  return new Pawn(color);
        }
    }
    public char getColor() {
        return color;
    }

    public boolean isWhite() {
        return color == 'w';
    }

    public boolean hasMoved() {
        return hasMoved;
    }

    public void setMoved(boolean moved) {
        hasMoved = moved;
    }
    public abstract char getType();

    public String getCode() {
        return "" + color + getType();
    }
    public abstract List<int[]> getMoves(Board board, int row, int col);

    public List<int[]> getAttacks(Board board, int row, int col) {
        return getMoves(board, row, col);
    }

    public Piece copy() {
        Piece p = create(color, getType());
        p.hasMoved = hasMoved;
        return p;
    }
    protected void addMoves(Board board, int row, int col, int[][] directions, boolean slide, List<int[]> moves){
        // Implementation for adding moves based on the piece's movement rules
        
    }
}