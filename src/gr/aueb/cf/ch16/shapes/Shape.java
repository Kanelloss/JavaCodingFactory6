package gr.aueb.cf.ch16.shapes;

public class Shape {
    private enum Type { RECTANGLE, CIRCLE }

    // Tag Field
    private final Type type;

    //  Fields for Rectangle
    private double height;
    private double width;

    // Fields for Circle
    private double radius;

    // Constructor for Rectangle
    public Shape(double height, double width) {
        type = Type.RECTANGLE;
        this.height = height;
        this.width = width;
    }

    // Constructor for Circle


    public Shape(Type type, Type type1) {
        this.type = type1;
        type = Type.CIRCLE;
        this.radius = radius;
    }

    public double getArea() {
        switch (type) {
            case CIRCLE:
                return Math.PI * radius * radius;
            case RECTANGLE:
                return width * height;
            default:
                throw new RuntimeException("Error");
        }
    }
}
