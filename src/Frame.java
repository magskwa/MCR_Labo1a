
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Frame extends JFrame {

    public void run(int nSquares, int nCircles) {
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        Cercle c = new Cercle(new Vector(200, 200), new Vector(1, 1), Color.BLUE, 10);
        this.add(c);
    }

    public static void main(String[] args){
        Frame f = new Frame();
        f.run(0, 0);
    }
}

