public class NewState extends State
{
    public NewState(Process p)
    {
        super(p, "new");
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
        return "-> there are no previous state for 'new'";
    }
}