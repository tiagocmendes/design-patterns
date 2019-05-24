public abstract class Logistics
{
    public abstract Transport createTransport();
    public void deliver(Product p)
    {
        Transport transport = createTransport();
        transport.deliver(p);
    };
}