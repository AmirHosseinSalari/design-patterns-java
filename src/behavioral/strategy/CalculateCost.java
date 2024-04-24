package behavioral.strategy;

public class CalculateCost implements Strategy{
    @Override
    public void proceed() {
        System.out.println("Cost calculated");
    }
}
