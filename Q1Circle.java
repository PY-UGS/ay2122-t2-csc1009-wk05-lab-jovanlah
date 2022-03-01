public class Q1Circle extends Q1GeometricObject{

    private double radius;

    public Q1Circle() {
    }

    public Q1Circle(double radius) {
        this.radius = radius;
    }
    public Q1Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = this.radius*this.radius*Math.PI;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2*Math.PI*this.radius;
        return perimeter;
    }

    public double getDiameter() {
        double diameter = 2*this.radius;
        return diameter;
    }

    public void printCircle() {
        System.out.println();
    }
}
