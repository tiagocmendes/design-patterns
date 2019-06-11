public abstract class ComputeAlgorithm
{
    protected double a;
    protected double b;
    protected double result;

    public void templateMethod(double a, double b)
    {
        setValues(a, b);
        compute();
        System.out.println("Value: " + returnValue());
    }

    public abstract void setValues(double a, double b);
    public abstract void compute();
    public abstract double returnValue();

}