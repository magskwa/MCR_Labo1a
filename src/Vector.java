public class Vector {
    int x;
    int y;

    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void refresh(Vector v){
        this.x += v.x;
        this.y += v.y;
    }

}
