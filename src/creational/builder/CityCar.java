package creational.builder;

public class CityCar {
    private String engine;
    private String color;
    private int maxSpeed;
    private int seat;

    public CityCar(String engine, String color, int maxSpeed, int seat) {
        this.engine = engine;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", seat=" + seat +
                '}';
    }
}
