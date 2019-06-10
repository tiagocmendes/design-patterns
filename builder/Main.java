public class Main 
{
    public static void main(String[] args) {

        Director director = new Director();

        FirstBuilder fb = new FirstBuilder();
        director.changeBuilder(fb);
        director.make();
        System.out.println(fb.getResult());

        SecondBuilder sb = new SecondBuilder();
        director.changeBuilder(sb);
        director.make();
        System.out.println(sb.getResult());
    }
}