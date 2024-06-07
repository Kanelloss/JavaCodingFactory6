package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1);
        Point2D p2 = new Point2D(5, 11);
        Point3D p3 = new Point3D(5, 9, 21);

//        p3.movePlusOne();
//        ((Point3D) p3).sayHi();

//        doMovePlus10(p1);
//        doMovePlus10(p2);
//        doMovePlus10(p3);

        System.out.println(p1.getDistanceFromOrigin());
        System.out.println(p2.getDistanceFromOrigin());
        System.out.println(p3.getDistanceFromOrigin());

    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    public static double distanceFromOrigin(Point point) {
       return point.getDistanceFromOrigin();
    }
}
