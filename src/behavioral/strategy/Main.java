package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new GetInformation());
        context.executeStrategy();
        context.setStrategy(new CalculateCost());
        context.executeStrategy();
        context.setStrategy(new PayCost());
        context.executeStrategy();
    }
}
