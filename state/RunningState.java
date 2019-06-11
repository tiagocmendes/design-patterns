public class RunningState extends State
{
    private static int transition;

    public RunningState(Process p)
    {
        super(p, "running");
    }

    @Override
    public String next()
    {   
        switch(transition++)
        {
            case 1:
                process.changeState(new ReadyState(process));
                return "ready";
            case 2:
                process.changeState(new WaitingState(process));
                return "waiting";
            case 3:
                process.changeState(new ExitState(process));
                break;
        }
        return "exiting";
    }

    @Override
    public String previous()
    {
        transition--;
        process.changeState(new ReadyState(process));
        return "ready";
    }
}