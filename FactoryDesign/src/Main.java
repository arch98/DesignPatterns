import ShapeFactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Shape shape = new Shape();
        ShapeFactory shape1 = shape.getShape("Circle");
        shape1.draw();
        shape1 = shape.getShape("Rectangle");
        shape1.draw();
    }
}