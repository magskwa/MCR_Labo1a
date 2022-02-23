
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(1000,1000);

        Cercle cercle = new Cercle();
        frame.add(cercle);
        cercle.drawing();
    }
}

