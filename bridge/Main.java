public class Main 
{
    public static void main(String[] args) {
        
        OS androidOS = new Android();
        OS ios = new IOs();

        Application app = new Facebook(androidOS);
        Application app2 = new Facebook(ios);

        app.start();
        app.pause();
        app.close();

        app2.start();
        app2.pause();
        app2.close();

        app.start();
        app.close();
    }
}