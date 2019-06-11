public class Main
{
    public static void main(String[] args) {
        
        double a = 5;
        double b = 3;

        System.out.println("Using add algorithm for a = " + a + " and b = " + b);
        ComputeAlgorithm alg = new AddAlgorithm();
        alg.templateMethod(a,b);

        System.out.println("Using strange algorithm for a = " + b + " and b = " + a);
        alg = new StrangeAlgorithm();
        alg.templateMethod(b,a);

    }
}