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


    //   Public API
    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y++;
    }

    @Override
    protected void reset() {
        super.reset();
        y = 0;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt((Math.pow(getX(), 2) + Math.pow(getY(), 2)));
    }
}
