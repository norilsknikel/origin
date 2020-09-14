package hw4.shape;

public class Triangle implements Shape {

    double base;
    double height;

    @Override
    public double square() {
        return (base * height)/2;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}
