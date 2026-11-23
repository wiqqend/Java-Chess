import javax.swing.SwingUtilities;

public class JavaChess {
    public static void main(String[] args){
        
        // made with claude for invokeLater, lambda, and javax.swing
        SwingUtilities.invokeLater(() -> {
            ChessWindow window = new ChessWindow();
            window.setVisible(true);
        });
    }
}
