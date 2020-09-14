package hw4.car;

public abstract class Car {
    String brand;
    String carClass;
    double weight;
    Engine motor;

    public abstract void start();

    public abstract void stop();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");

    }

    public abstract void printInfo();

    public Car(String brand, String carClass, double weight, Engine motor) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = motor;
    }
}
