package Graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class Frame implements Displayer{

    private JFrame jframe;
    public JPanel panel;
    private Image image;

    private int xDim = 500;
    private int yDim = 500;

    private static Frame instance;

    public static Frame getInstance(){
        if(instance == null) instance = new Frame();
        return instance;
    }

    private class myPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image,0,0,null);
            image =  panel.createImage(getWidth(), getHeight());
        }
    }


    private Frame(){
        jframe = new JFrame();
        panel = new myPanel();

        jframe.setSize(xDim, yDim);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

        panel.setBackground(Color.WHITE);
        panel.setVisible(true);
        panel.setSize(xDim, yDim);
        panel.setPreferredSize(new Dimension(xDim, yDim));
        jframe.add(panel);
        image =  panel.createImage(getWidth(), getHeight());

    }

    public void addKeyListener(KeyAdapter ka) {
        jframe.addKeyListener(ka);
    }


    @Override
    public int getWidth() {
        return jframe.getWidth();
    }

    @Override
    public int getHeight() {
        return jframe.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) image.getGraphics();
    }

    @Override
    public void repaint() {
        panel.repaint();
    }

    @Override
    public void setTitle(String title) {
        jframe.setTitle(title);
    }


}

