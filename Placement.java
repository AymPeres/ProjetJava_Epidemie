public class Placement {
  
    private float x;
    private double y;

    public Placement() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Placement(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculerDistance(Placement autrePosition) {
        Math.sqrt(Math.pow(this.x - autrePosition.x, 2) + Math.pow(this.y - autrePosition.y, 2));
        return d ;
    }

    public String toString() {
        return "Position{x=" + x + ", y=" + y + '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Placement position = (Placement) o;
        return Double.compare(position.x, x) == 0 && 
               Double.compare(position.y, y) == 0;
    }
}
