package behavioral.strategy;

public class PayCost implements Strategy{
    @Override
    public void proceed() {
        System.out.println("Payed");
    }
}
