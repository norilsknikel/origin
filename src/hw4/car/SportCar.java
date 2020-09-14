package hw4.car;

public class SportCar extends Car {

    double topSpeed;

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("SportCar{" +
                "topSpeed=" + topSpeed +
                ", brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", motor.maker=" + motor.maker +
                ", motor.capacity=" + motor.capacity +
                '}');

    }

    public SportCar(String brand, String carClass, double weight, Engine motor, double topSpeed) {
        super(brand, carClass, weight, motor);
        this.topSpeed = topSpeed;
    }
}
