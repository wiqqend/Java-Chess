// Gets the current board state


import java.util.List;
public class Board implements ChessBackend{
    private String[] whiteCaptures = new String[15];
    private String[] blackCaptures = new String[15];

    private String[][] notation = {
        {"8A", "8B", "8C", "8D", "8E", "8F", "8G", "8H"},
        {"7A", "7B", "7C", "7D", "7E", "7F", "7G", "7H"}, 
        {"6A", "6B", "6C", "6D", "6E", "6F", "6G", "6H"},
        {"5A", "5B", "5C", "5D", "5E", "5F", "5G", "5H"},
        {"4A", "4B", "4C", "4D", "4E", "4F", "4G", "4H"},
        {"3A", "3B", "3C", "3D", "3E", "3F", "3G", "3H"},
        {"2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H"},
        {"1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H"}
    };

    private String[][] piecesOnBoard = {
        {"", "", "","", "", "", "", ""},
        {"bP", "bP", "bP","bP", "bP", "bP", "bP", "bP"}, 
        {"", "", "","", "", "", "", ""},
        {"", "", "","", "", "", "", ""},
        {"", "", "","", "", "", "", ""},
        {"", "", "","", "", "", "", ""},
        {"wP", "wP", "wP","wP", "wP", "wP", "wP", "wP"},
        {"", "", "","", "", "", "", ""}
    };

    //gets game state of board 
    @Override
    public String getPieceAt(int row, int col){
        return piecesOnBoard[row][col];
    }
    
    @Override
    public List<int[]> getLegalMoves(int row, int col){
        return null;
    }

    @Override
    public boolean makeMove(int fromRow, int fromCol, int toRow, int toCol, char promotion){
        return false;
    };

    @Override
    public boolean isWhiteTurn(){
        return false;
    }

    @Override
    public boolean isCheck(){
        return false;
    }

    @Override
    public boolean isCheckmate(){
        return false;
    }

    @Override
    public boolean isStalemate(){
        return false;
    }

    @Override
    public void newGame(){

    }

    // slight reach goal
    @Override
    public boolean undo(){
        return false;
    }

    @Override
    public List<String> getMoveHistory(){
        return null;
    }

    @Override
    public List<String> getCapturedPieces(boolean byWhite){
        return null;
    }

    //Returns piece's unicode values
    public String getPieceUnicode(String piece){
        if(piece == "wP"){
            return "\u2659";
        }else if (piece == "bP"){
            return "\u265F";
        }else{
            return "";
        }
    }
}
