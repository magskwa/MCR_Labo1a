
import javax.swing.*;

public class Frame extends JFrame {

    Frame() { super(); }

    public void run(int nSquares, int nCircles) {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        Cercle c = new Cercle(new Vector(0, 0), new Vector(0, 0), 50);
        this.add(c);
        c.draw();



    }

    public static void main(String[] args){
        Frame f = new Frame();
        f.run(0, 0);
    }
}

