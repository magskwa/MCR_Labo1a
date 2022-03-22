import Bouncable.Bouncable;
import Factories.EmptyBouncableFactory;
import Factories.FillBouncableFactory;
import Graphic.*;
import Graphic.Frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;


public class Bouncers {

    private LinkedList<Bouncable> bouncers;
    private Frame frame;

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
                        FillBouncableFactory factory = new FillBouncableFactory();
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

    public void running() {
        Timer clock = new Timer();
        clock.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for(Bouncable b : new LinkedList<Bouncable>(bouncers))
                {
                    b.move();
                    b.draw();
                }
                frame.repaint();
            }
        },0, 10);

    }

    public static void main(String ... args) {
        new Bouncers().running();
    }


}

