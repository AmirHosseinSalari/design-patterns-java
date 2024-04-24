package behavioral.strategy;

public class GetInformation implements Strategy{
    @Override
    public void proceed() {
        System.out.println("Getting information");
    }
}
