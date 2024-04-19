package creational.builder;

public class SportCarBuilder implements Builder{

    private String engine;
    private String color;
    private int maxSpeed;
    private int seat;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setSeats(int seat) {
        this.seat = seat;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SportCat getResult(){
        return new SportCat(engine,color,maxSpeed,seat);
    }
}
