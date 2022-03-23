package Graphic;

import Bouncable.FillCercle;
import Bouncable.FillSquare;
import Util.Vector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Frame implements Displayer{

    private JFrame jframe;
    public JPanel jpanel;
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
        }
    }


    private Frame(){
        jframe = new JFrame();
        jpanel = new myPanel();

        jframe.setSize(xDim, yDim);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

        jpanel.setBackground(Color.WHITE);
        jpanel.setVisible(true);
        jpanel.setSize(xDim, yDim);
        jpanel.setPreferredSize(new Dimension(500, 500));
        jframe.add(jpanel);
        image =  jpanel.createImage(getWidth(), getHeight());

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
        jpanel.repaint();
        image =  jpanel.createImage(getWidth(), getHeight());
    }

    @Override
    public void setTitle(String title) {
        jframe.setTitle(title);
    }


}


/*
public class Frame extends JFrame implements Displayer {

    private static Frame singletonFrame;
    private int xDim = 500;
    private int yDim = 500;
    MyPanel board;

    private Frame() {
        super();
        board = new MyPanel(xDim, yDim);
    }

    public void setData(int xDim, int yDim){
        this.xDim = xDim;
        this.yDim = yDim;
    }

    public static Frame getInstance() {
        if (singletonFrame == null)
            singletonFrame = new Frame();
        return singletonFrame;
    }

    public int getWidth(){
        return xDim;
    }

    public int getHeight(){
        return yDim;
    }

    public void run(int nSquares, int nCircles) {

        setSize(xDim, yDim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        board = new MyPanel(xDim, yDim);
        this.add(board);
        this.pack();
        board.repaint();

        int maxSpeed = 10;
        int minSpeed = 5;
        int maxSize = 20;
        int minSize = 10;

        for (int i = 0; i < nCircles; i++) {

            int rayon = new Random().nextInt(maxSize - minSize) + minSize;
            Color color = new Color(new Random().nextInt());
            Vector initialPosition = new Vector(new Random().nextInt(xDim - rayon) + rayon, new Random().nextInt(yDim - rayon) + rayon);
            Vector initialDirection = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                    new Random().nextInt(maxSpeed - minSpeed) + minSpeed);

            FillCercle c = new FillCercle(initialPosition, initialDirection, color, rayon);
            board.addEntity(c);

        }

        for (int i = 0; i < nSquares; i++) {


            int width = new Random().nextInt(maxSize - minSize) + minSize;
            int heigth = new Random().nextInt(maxSize - minSize) + minSize;
            Color color = new Color(new Random().nextInt());
            Vector initialPosition = new Vector(new Random().nextInt(xDim - width) + width, new Random().nextInt(yDim - heigth) + heigth);
            Vector initialDirection = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                    new Random().nextInt(maxSpeed - minSpeed) + minSpeed);

            FillSquare s = new FillSquare(initialPosition, initialDirection, color, heigth, width);
            board.addEntity(s);

        }
    }


    public Graphics2D getGraphics(){
        return (Graphics2D) super.getGraphics();
    }
}

 */

