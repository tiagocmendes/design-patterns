public class SkyLogistics extends Logistics
{
    @Override 
    public Transport createTransport()
    {
        return new Airplane();
    }
}