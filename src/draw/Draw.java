package draw;



import gui.Gui;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);



        g.setColor(Color.RED);
        g.drawRect(9,9, Gui.ALTURA+2, Gui.LARGURA+2);

        repaint();

    }


}
