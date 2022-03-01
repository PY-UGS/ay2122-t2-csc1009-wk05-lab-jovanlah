public class Triangle extends Q2Shape {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
    
    public double getArea() {
        return (dim1*dim2) /2;
    }
    
}
