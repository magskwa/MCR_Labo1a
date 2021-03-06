
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Frame extends JFrame {

    private int xDim;
    private int yDim;
    MyPanel board;

    Frame(int xDim, int yDim) {
        super();
        board = new MyPanel(xDim, yDim);
        this.xDim = xDim;
        this.yDim = yDim;
    }

    public void run(int nSquares, int nCircles) {

        setSize(xDim, yDim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        board = new MyPanel(xDim, yDim);
        this.add(board);
        Entity.setFrameDimensions(xDim, yDim);

        int maxSpeed = 10;
        int minSpeed = 5;
        int maxSize = 20;
        int minSize = 10;

        for (int i = 0; i < nCircles; i++) {
            System.out.println("Cercle " + (i + 1));

            Vector initialPosition = new Vector(new Random().nextInt(xDim), new Random().nextInt(yDim));
            Vector initialDirection = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                    new Random().nextInt(maxSpeed - minSpeed) + minSpeed);
            int rayon = new Random().nextInt(maxSize - minSize) + minSize;
            Color color = new Color(new Random().nextInt());

            Cercle c = new Cercle(initialPosition, initialDirection, color, rayon);
            board.addEntity(c);

        }

        for (int i = 0; i < nSquares; i++) {
            System.out.println("Carre " + (i + 1));

            Vector initialPosition = new Vector(new Random().nextInt(xDim), new Random().nextInt(yDim));
            Vector initialDirection = new Vector(new Random().nextInt(maxSpeed - minSpeed) + minSpeed,
                    new Random().nextInt(maxSpeed - minSpeed) + minSpeed);
            int width = new Random().nextInt(maxSize - minSize) + minSize;
            int heigth = new Random().nextInt(maxSize - minSize) + minSize;
            Color color = new Color(new Random().nextInt());

            Square s = new Square(initialPosition, initialDirection, color, heigth, width);
            board.addEntity(s);

        }
    }

    public static void main(String[] args){
        Frame f = new Frame(500, 500);
        f.run(3,4);
    }
}

