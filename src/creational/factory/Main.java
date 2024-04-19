package creational.factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(CarFactory.BMW);
        car.startEngine();
    }
}
