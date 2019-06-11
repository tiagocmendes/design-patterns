public class ConsoleVisitor implements Visitor 
{
    @Override
    public void visitDot(Dot dot)
    {
        System.out.println("Visiting dot (" + dot.getX() + "," + dot.getY() + ")");
    }

    @Override
    public void visitCircle(Circle circle)
    {
        System.out.println("Visiting " + circle.getColor() + " circle (" + circle.getX() + "," + circle.getY() + ")");
    }
}