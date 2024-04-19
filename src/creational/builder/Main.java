package creational.builder;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer();

        SportCarBuilder builder = new SportCarBuilder();
        producer.buildSportCar(builder);

        SportCat car = builder.getResult();
        System.out.println(car.toString());

        CityCarBuilder builder1 = new CityCarBuilder();
        producer.buildCityCar(builder1);

        CityCar car1 = builder1.getResult();
        System.out.println(car1);

    }
}
