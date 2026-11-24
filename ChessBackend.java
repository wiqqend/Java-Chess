import java.util.List;

public interface ChessBackend {
    String getPieceAt(int row, int col);
    List<int[]> getLegalMoves(int row, int col);
    boolean makeMove(int fromRow, int fromCol, int toRow, int toCol, char promotion);
    boolean isWhiteTurn();
    boolean isCheck();
    boolean isCheckmate();
    boolean isStalemate();
    void newGame();
    boolean undo();
    List<String> getMoveHistory();
    List<String> getCapturedPieces(boolean byWhite);
    int[] getLastMove();
}
