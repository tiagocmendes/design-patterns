public class ReadyState extends State
{
    public ReadyState(Process p)
    {
        super(p, "ready");
    }

    @Override
    public String next()
    {   
        process.changeState(new RunningState(process));
        return "running";
    }

    @Override
    public String previous()
    {
        return "-> there are no previous state for 'ready'";
    }
}