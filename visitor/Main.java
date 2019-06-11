public class Main 
{
    public static void main(String[] args) {
        
        Visitor visitor = new ConsoleVisitor();

        Shape shape1 = new Dot(3,4);
        Shape shape2 = new Circle(6,7, "Red");

        shape1.accept(visitor);
        shape2.accept(visitor);

        shape1.move(9,8);
        shape1.accept(visitor);

    }
}