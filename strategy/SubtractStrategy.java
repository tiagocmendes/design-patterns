public class SubtractStrategy implements Strategy
{
    @Override
    public void compute(double a, double b)
    {
        System.out.println(a + " - " + b + " = " + (a-b));
    }
}