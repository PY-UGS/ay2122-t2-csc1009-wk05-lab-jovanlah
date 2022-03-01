public class Ellipse extends Q2Shape {

    public Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double getArea() {
        return super.dim1 * super.dim2 * Math.PI;
    }
    
}
