public class Vector {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void refresh(Vector v){
        this.x += v.x;
        this.y += v.y;
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

}
