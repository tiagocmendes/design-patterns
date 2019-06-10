public class Process
{
    private static int pid_cnt;
    private int pid;
    private String name;

    public Process(String name)
    {
        this.pid = ++pid_cnt;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Process " + this.pid;
    }
}