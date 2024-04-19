package creational.factory;

public class CarFactory {

    public static final String BMW = "BMW";
    public static final String TOYOTA = "TOYOTA";
    public static final String MERCEDES = "MERCEDES";

    public Car getCar(String carName){
        if (carName == null){
            return null;
        }
        if (carName.equals(BMW)){
            return new BMW();
        }else if(carName.equals(TOYOTA)){
            return new Toyota();
        }if (carName.equals(MERCEDES)){
            return new Mercedes();
        }
        return null;
    }

}
