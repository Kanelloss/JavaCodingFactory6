package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointXYZ;

public class MainPoint {

    public static void main(String[] args) {
        PointXYZ Point1 = new PointXYZ(100, 50, 75);

        System.out.println("Point state: " + Point1.convertToString());
        System.out.println("XY Distance: " + Point1.getXYDistance());
        System.out.println("YZ Distance: " + Point1.getYZDistance());
        System.out.println("XZ Distance: " + Point1.getXZDistance());
        System.out.println("XYZ Distance: " + Point1.getXYZDistance());

    }
}
