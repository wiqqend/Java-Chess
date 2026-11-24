import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ChessGUI extends JFrame {
    public static void main(String args[]){
        SwingUtilities.invokeLater(() -> {
            ChessWindow window = new ChessWindow();
            window.setVisible(true);
        });
    }
}
