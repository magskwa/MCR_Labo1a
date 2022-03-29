import Bouncable.Bouncable;
import Factories.EmptyBouncableFactory;
import Factories.FilledBouncableFactory;
import Graphic.Frame;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * Bouncers.java
 * Programm class to run a Window in which you can create Bouncables in it by pressing certain keys.
 */
public class Bouncers {

    private LinkedList<Bouncable> bouncers;
    private Frame frame;


    /**
     * Constructor of Bouncers
     * @brief creates all it's components and the keys for the program by using the addKeyListener of its Frame object
     */
    public Bouncers(){
        bouncers = new LinkedList<>();

        frame = Frame.getInstance();
        frame.setTitle("Bounce Bounce");


        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_E :{
                        bouncers = new LinkedList<>();
                        break;
                    }
                    case KeyEvent.VK_B:{
                        EmptyBouncableFactory factory = new EmptyBouncableFactory();
                        for (int i = 0; i < 10; ++i) {
                            bouncers.add(factory.createCercle());
                            bouncers.add(factory.createSquare());
                        }
                        break;
                    }
                    case KeyEvent.VK_F:{
                        FilledBouncableFactory factory = new FilledBouncableFactory();
                        for (int i = 0; i < 10; ++i) {
                            bouncers.add(factory.createCercle());
                            bouncers.add(factory.createSquare());
                        }
                        break;
                    }
                    case KeyEvent.VK_Q:{
                        System.exit(0);
                        break;
                    }
                }
            }
        });
    }

    /**
     * Method to run the programm Bounce Bounce
     */
    public void running() {
        new Timer(10, e -> {

            for (Bouncable b : bouncers)
            {
                b.move();
                b.draw();
            }
            frame.repaint();
        }  ).start();
    }

    public static void main(String ... args) {
        new Bouncers().running();
    }


}

