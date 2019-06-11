public class Main 
{
    public static void main(String[] args) {
        
        Context ctx = new Context();

        double a = 5;
        double b = 3;

        ctx.setStrategy(new AddStrategy());
        ctx.compute(a,b);

        ctx.setStrategy(new SubtractStrategy());
        ctx.compute(a,b);

        ctx.setStrategy(new MultiplyStrategy());
        ctx.compute(a,b);

        ctx.setStrategy(new DivideStrategy());
        ctx.compute(a,b);

    }
}