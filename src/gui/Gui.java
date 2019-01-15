package gui;

import draw.Draw;

import javax.swing.*;

public class Gui{
    public static Draw d;
    JFrame jf;
    public static final int ALTURA = 512, LARGURA = 512, XOFF = 10, YOFF = 10;

    public void criarGui(){
        jf = new JFrame("Jogo da Vida");
        jf.setSize(550,570);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);


        d = new Draw();
        d.setBounds(0,0,550,570);
        jf.setVisible(true);
        jf.add(d);

        jf.setVisible(true);

    }


}
