package Abstraction1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(" redColor ", 3.144, 13);
        Circle circle = new Circle(" WhiteColor");

        System.out.println("Rectangle Area" + rectangle.getArea());
        System.out.println("Circle Area" + circle.getArea());

        System.out.println(rectangle.draw());
        System.out.println(circle.draw());
        System.out.println(circle.radius);
        System.out.println("This is just for git hub am adding");
    }
}
