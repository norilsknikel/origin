package hw4.car;

public class Lorry extends Car {

    double carryCapacity;

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println("Lorry{" +
                "carryCapacity=" + carryCapacity +
                ", brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", motor.maker=" + motor.maker +
                ", motor.capacity=" + motor.capacity +
                '}');
    }

    public Lorry(String brand, String carClass, double weight, Engine motor, double carryCapacity) {
        super(brand, carClass, weight, motor);
        this.carryCapacity = carryCapacity;
    }
}
