public class Placement {
  
    private float x;
    private float y;

    public Placement() {
        this.x = 0;
        this.y = 0;
    }

    public Placement(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double distance(Placement p) {
        double d= Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        return d ;
    }

    public String toString() {
        return "Placement est " + x + ", y=" + y;
    }


    public boolean equals(Placement o) {
        return Float.compare(o.x, x) == 0 && Float.compare(o.y, y) == 0;
    }
}
