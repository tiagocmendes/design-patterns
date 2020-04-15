public class Circle extends Dot
{
    private String color;

    public Circle(int x, int y, String color)
    {
        super(x,y);
        this.color = color;
    }

    @Override
    public void move(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitCircle(this);
    }

    public String getColor() { return color; }
}
