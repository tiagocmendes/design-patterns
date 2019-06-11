public class Dot implements Shape
{
    protected int x;
    protected int y;

    public Dot(int x, int y)
    {
        this.x = x;
        this.y = y;
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
        visitor.visitDot(this);
    }

    public int getX()
    {
        return x;
    }


    public int getY()
    {
        return y;
    }
}