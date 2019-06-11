public class ExitState extends State
{
    private static int transition;

    public ExitState(Process p)
    {
        super(p, "exiting");
    }

    @Override
    public String next()
    {   
        return "-> there are no next state for 'exiting'";
    }

    @Override
    public String previous()
    {
        process.changeState(new RunningState(process));
        return "running";
    }
}