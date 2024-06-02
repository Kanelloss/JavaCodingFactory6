package gr.aueb.cf.ch13.model;

public class PointXYZ {
    private int x;
    private int y;
    private int z;

    // Default Constructor
    public PointXYZ() {

    }

    // Overloaded Constructor
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String convertToString() {
        return "(x: " + x + ", y: " + y + ", z: " + z + ")";
    }

    public double getXYDistance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

   public double getYZDistance() {
       return Math.sqrt(Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public double getXZDistance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.z, 2));
    }

    public double getXYZDistance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

}
