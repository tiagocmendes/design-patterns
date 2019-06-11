public class StrangeAlgorithm extends ComputeAlgorithm
{
    @Override
    public void setValues(double a, double b)
    {
        this.a = b;
        this.b = a;
    }

    @Override
    public void compute()
    {
        this.result = (this.a + this.b) + (this.b - this.a);
    }

    @Override
    public double returnValue()
    {
        return result + 69;
    }

}