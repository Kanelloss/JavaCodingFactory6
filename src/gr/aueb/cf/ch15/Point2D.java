package gr.aueb.cf.ch15;

public class Point2D extends Point {
    protected double y;

    public Point2D() {
        // super();        // Points to super class (Point).
        // y = 0;       // Automatically JVM does these two.
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String convertToString() {
        return "(" + getX() + ", " + y + ")";
    }


    // Public API

    public  void movePlus10() {
        x += 10;
    }

    public void movePlusOne() {
        x++;
    }


}
