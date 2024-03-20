package userTypes;

public class FineContext {
    private FineStrategy strategy;

    public void setStrategy(FineStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy() {
        return strategy.calculateFine();
    }
}