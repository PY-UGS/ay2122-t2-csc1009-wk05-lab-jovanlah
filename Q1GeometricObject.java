public class Q1GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public Q1GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Q1GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        this.dateCreated = new java.util.Date(); 
        return this.dateCreated;
    }

    public String toString() {
        return getDateCreated() + "\ncolor: " + this.color + " and filled: " + this.filled;
    }

}
