package creational.builder;

public class Producer {

    public void buildSportCar(Builder builder){
        builder.setColor("Red");
        builder.setEngine("TU5");
        builder.setMaxSpeed(200);
        builder.setSeats(2);
    }

    public void buildCityCar(Builder builder){
        builder.setColor("Blue");
        builder.setEngine("XU7");
        builder.setMaxSpeed(120);
        builder.setSeats(4);
    }
}
