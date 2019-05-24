class Airplane implements Transport
{
    private static int generator;
    private int id;

    public Airplane()
    {
        this.id = ++generator;
        System.out.println("New Airplane created with id " + this.id);
    }

    @Override
    public String toString()
    {
        return "Airplane " + id;
    }

    @Override
    public void deliver(Product p)
    {
        System.out.println("Airplane " + id + " will deliver " + p.toString());
    }
}