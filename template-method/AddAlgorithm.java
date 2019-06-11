public class AddAlgorithm extends ComputeAlgorithm
{
    @Override
    public void setValues(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public void compute()
    {
        this.result = this.a + this.b;
    }

    @Override
    public double returnValue()
    {
        return result;
    }

}