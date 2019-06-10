public class MacOS implements OS
{

    public String version;
    public String inventor = "Steve Jobs";

    public MacOS(String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "MacOS - [version: " + version + ", inventor: " + inventor + "]";
    }
    
    public void load()
    {
        System.out.println("MacOS is loading.");
    }

    public void shutDown()
    {
        System.out.println("MacOS is shutting down.");
    }

    public void startProcess(Process p)
    {
        System.out.println("MacOS is starting " + p);
    };

    public void pauseProcess(Process p)
    {
        System.out.println("MacOS is pausing " + p);
    };

    public void finishProcess(Process p)
    {
        System.out.println("MacOS is finishing " + p);
    };
}