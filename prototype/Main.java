import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Shape> copiedShapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 1;
        circle.y = 2;
        circle.color = "Red";
        circle.radius = 4;
        
        Square square = new Square();
        square.x = 5;
        square.y = 6;
        square.color = "Green";

        Square square2 = new Square();
        square2.x = 4;
        square2.y = 2;
        square2.color = "Yellow";

        Square square3 = (Square) square.clone();

        shapes.add(circle);
        shapes.add(square);
        shapes.add(square2);
        shapes.add(square3);

        for(Shape s: shapes)
            copiedShapes.add(s.clone());
        
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != copiedShapes.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(copiedShapes.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
           
    }
}