public class Product
{
    private static int generator;
    private int id;
    private String name;
    private double price;
    
    public Product(String name, double price)
    {
        this.id = ++generator;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product [ ID: " + id + ", Name: " + name + ", Price: " + price + " ]";
    }
}