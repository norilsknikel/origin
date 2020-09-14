package hw4.shape;

public class Run {
    public static void main(String[] args) {

        Shape circle = new Circle(15.20);
        Shape triangle = new Triangle(25.1, 56.1);
        Shape rectangle = new Rectangle(2.65, 54.3);

        printShapes(circle, triangle, rectangle);

    }

    public static void printShapes(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println("Площадь фигуры " + shape.square());
        }
    }

}
