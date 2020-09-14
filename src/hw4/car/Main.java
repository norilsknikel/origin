package hw4.car;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(400,"VAZ");
        Engine engine2 = new Engine(700, "MinskAZ");

        Car car1 = new SportCar("AvtoVAZ", "Спорткар", 1500, engine1, 300);
        Car car2 = new Lorry("MinskAZ", "Грузовик", 4000, engine2, 3000);

        cars(car1,car2);

    }

    public static void cars(Car... cars) {
        for (Car car : cars) {
            car.start();
            car.stop();
            car.turnLeft();
            car.turnRight();
            car.printInfo();
        }
    }


}
