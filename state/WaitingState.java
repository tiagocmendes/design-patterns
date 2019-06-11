public class WaitingState extends State
{
    public WaitingState(Process p)
    {
        super(p, "waiting");
    }

    @Override
    public String next()
    {   
        process.changeState(new ReadyState(process));
        return "ready";
    }

    @Override
    public String previous()
    {
        process.changeState(new RunningState(process));
        return "running";
    }
}