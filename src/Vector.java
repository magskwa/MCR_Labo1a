public class Vector {
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

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

    public Vector reverse() {
        return new Vector(-x, -y);
    }

    public double norm() {
        return Math.sqrt((double)(x * x) + (double)(y * y));
    }

    public double scalarProduct(Vector other) {
        return x * other.x + y * other.y;
    }

    public double angle(Vector other) {
        return Math.acos(scalarProduct(other) / (norm() * other.norm()));
    }

    public Vector rotate(double angle) {
        return new Vector((int)(x * Math.cos(angle) - y * Math.sin(angle)), (int)(x * Math.sin(angle) + y * Math.cos(angle)));
    }

}
