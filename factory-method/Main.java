public class Main
{
    public static void main(String[] args)
    {
        Product p1 = new Product("Product1", 2.00);
        Product p2 = new Product("Product2", 4.00);
        Product p3 = new Product("Product3", 6.00);
        Product p4 = new Product("Product4", 8.00);       

        Logistics c1 = new SkyLogistics();
        Logistics c2 = new RoadLogistics();

        c1.deliver(p1);
        c2.deliver(p2);
        c2.deliver(p3);
        c1.deliver(p4);
    }
}