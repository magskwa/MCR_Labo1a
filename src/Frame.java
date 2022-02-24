
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class Frame extends JFrame {

    private int xDim;
    private int yDim;

    Frame(int xDim, int yDim) {
        super();
        this.xDim = xDim;
        this.yDim = yDim;
    }

    public void run(int nSquares, int nCircles) {
        setSize(xDim, yDim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        Entity.setFrameDimensions(xDim, yDim);

        LinkedList<Entity> entities = new LinkedList<>();
        for (int i = 0; i < nSquares; i++) {

            Vector initialPosition = new Vector(new Random().nextInt(), new Random().nextInt());
            Vector initialDirection = new Vector(new Random().nextInt(), new Random().nextInt());
            int width = new Random().nextInt();
            int heigth = new Random().nextInt();
            Color color = new Color(new Random().nextInt());

            Square s = new Square(initialPosition, initialDirection, color, heigth, width);
            this.add(s);
            entities.add(s);

        }

        for (int i = 0; i < nCircles; i++) {

            Vector initialPosition = new Vector(new Random().nextInt(), new Random().nextInt());
            Vector initialDirection = new Vector(new Random().nextInt(), new Random().nextInt());
            int rayon = new Random().nextInt();
            Color color = new Color(new Random().nextInt());

            Cercle c = new Cercle(initialPosition, initialDirection, color, rayon);
            this.add(c);
            entities.add(c);

        }
    }

    public static void main(String[] args){
        Frame f = new Frame(600, 600);
        f.run(0, 0);
    }
}

