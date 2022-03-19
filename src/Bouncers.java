import Bouncable.Bouncable;
import Graphic.*;
import Graphic.Frame;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Timer;


public class Bouncers {
    private LinkedList<Bouncable> bouncers;
    private Frame frame;
    private Timer timer;

    public Bouncers() implements ActionListener{
        timer = new Timer();
        timer.setRepeats(true);
        timer.start();
        bouncers = new LinkedList<Bouncable>();

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                for (Entity en : entities) {
                    Vector position = en.getPosition();
                    int x = position.getX();
                    int y = position.getY();
                    int width = en.getWidth();
                    int height = en.getHeight();

                    if (x - width / 2 <= 0)
                        position.setX(width / 2);
                    if (x + width / 2 >= getWidth())
                        position.setX(getWidth() - width / 2);
                    if (y - height / 2 <= 0)
                        position.setY(height / 2);
                    if (y + height / 2 >= getHeight())
                        position.setY(HEIGHT - height / 2);
                }
            }
        });
    }

    public void run() {

    }

    public static void main(String ... args) {
        new Bouncers().run();
    }
}

