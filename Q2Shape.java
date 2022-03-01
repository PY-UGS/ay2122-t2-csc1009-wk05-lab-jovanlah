public abstract class Q2Shape{
    
    double dim1;
    double dim2;

    public Q2Shape(double dim1) {
        this.dim1=dim1;
    }

    public Q2Shape(double dim1, double dim2) {
        this.dim1=dim1;
        this.dim2=dim2;
    }

    protected abstract double getArea();

    public String toString(){
        String Classname = this.getClass().getSimpleName();
        return "Inside Area for " + Classname + ".\n";
    }
}

