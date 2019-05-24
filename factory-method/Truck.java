class Truck implements Transport
{
    private static int generator;
    private int id;

    public Truck()
    {
        this.id = ++generator;
        System.out.println("New Truck created with id " + this.id);
    }

    @Override
    public String toString()
    {
        return "Truck " + id;
    }

    @Override
    public void deliver(Product p)
    {
        System.out.println("Truck " + id + " will deliver " + p.toString());
    }
}