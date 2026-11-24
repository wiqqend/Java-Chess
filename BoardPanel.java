// All of this code was made with the help of Claude as we havent learned javax.swing

import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {
    private static final Color LIGHT = new Color(238, 238, 210);
    private static final Color DARK = new Color(118, 150, 86);
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int squareSize = Math.min(getWidth(), getHeight()) / 8;

        for (int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i + j) % 2 == 0){
                    g.setColor(LIGHT);
                }else{
                    g.setColor(DARK);
                }

                g.fillRect(j * squareSize, i * squareSize, squareSize, squareSize);
            }
        }
    }
}