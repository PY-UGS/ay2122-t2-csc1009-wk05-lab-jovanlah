public class Circle extends Q2Shape {

    public Circle(double dim1) {
        super(dim1);
    }

    public double getArea() {
       return dim1 * dim1 * Math.PI;
    }
    
}
