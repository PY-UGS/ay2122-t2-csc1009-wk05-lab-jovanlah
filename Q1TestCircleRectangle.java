public class Q1TestCircleRectangle{
    public static void main(String[] args){
        Q1Circle circle = new Q1Circle(1);
        System.out.println("A circle created on " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Q1Rectangle rectangle = new Q1Rectangle(2, 4);
        System.out.println("A rectangle created on " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }

}