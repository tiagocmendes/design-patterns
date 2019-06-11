public interface Shape
{
    void move(int x, int y);
    void accept(Visitor visitor);
}