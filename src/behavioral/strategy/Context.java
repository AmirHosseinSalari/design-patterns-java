package behavioral.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void executeStrategy(){
        this.strategy.proceed();
    }
}
