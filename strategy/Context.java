public class Context
{
    private Strategy strategy;

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void compute(double a, double b)
    {
        if(strategy != null) strategy.compute(a,b);
    }
}