
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Frame extends JFrame implements Displayer {

    private static Frame frame;
    private int xDim = 400;
    private int yDim = 400;
    MyPanel board;

    private Frame() {
        super();
        board = new MyPanel(xDim, yDim);
    }

    public void setData(int xDim, int yDim){
        this.xDim = xDim;
        this.yDim = yDim;
    }

    public int getDataX(){
        return xDim;
    }

    public int getDataY(){
        return yDim;
    }


    public static Frame getInstance(){
        if(frame == null){
            frame = new Frame();
        }
        return frame;
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

            Cercle c = new Cercle(initialPosition, initialDirection, color, rayon);
            board.addEntity(c);

        }

        for (int i = 0; i < nSquares; i++) {


            int width = new Random().nextInt(maxSize - minSize) + minSize;
            int heigth = new Random().nextInt(maxSize - minSize) + minSize;
            Color color = new Color(new Random().nextInt());
            Vector initialPosition = new Vector(new Random().nextInt(xDim - width) + width, new Random().nextInt(yDim - heigth) + heigth);
            Vector initialDirection = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                    new Random().nextInt(maxSpeed - minSpeed) + minSpeed);

            Square s = new Square(initialPosition, initialDirection, color, heigth, width);
            board.addEntity(s);

        }
    }


    public Graphics2D getGraphics(){
        return (Graphics2D) super.getGraphics();
    }
}

