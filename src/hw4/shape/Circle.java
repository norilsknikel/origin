package hw4.shape;

public class Circle implements Shape {

    double radius;

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
