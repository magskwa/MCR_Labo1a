import Graphic.Frame;

public class App {

    public static void main(String[] args){
        Frame f = Frame.getInstance();
        f.setData(500,500);
        f.run(100,100);

    }
}

/*
public class Bouncers {
 private LinkedList<Bouncable.Bouncable> bouncers;

public Bouncers() {

}
    public void run() {

    }
    public static void main(String ... args) {
        new Bouncers().run();
    }
}
 */
