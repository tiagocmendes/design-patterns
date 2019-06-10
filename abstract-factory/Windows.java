public class Windows implements OS
{

    public String version;
    public String inventor = "Bill Gates";

    public Windows(String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "Windows - [version: " + version + ", inventor: " + inventor + "]";
    }
    
    public void load()
    {
        System.out.println("Windows is loading.");
    }

    public void shutDown()
    {
        System.out.println("Windows is shutting down.");
    }

    public void startProcess(Process p)
    {
        System.out.println("Windows is starting " + p);
    };

    public void pauseProcess(Process p)
    {
        System.out.println("Windows is pausing " + p);
    };

    public void finishProcess(Process p)
    {
        System.out.println("Windows is finishing " + p);
    };
}