public class Linux implements OS
{

    public String version;
    public String inventor = "Linus Torvald";

    public Linux(String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "Linux - [version: " + version + ", inventor: " + inventor + "]";
    }
    
    public void load()
    {
        System.out.println("Linux is loading.");
    }

    public void shutDown()
    {
        System.out.println("Linux is shutting down.");
    }

    public void startProcess(Process p)
    {
        System.out.println("Linux is starting " + p);
    };

    public void pauseProcess(Process p)
    {
        System.out.println("Linux is pausing " + p);
    };

    public void finishProcess(Process p)
    {
        System.out.println("Linux is finishing " + p);
    };
}