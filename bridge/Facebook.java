public class Facebook implements Application
{
    protected OS os;
    private String name = "Facebook";

    public Facebook() {}

    public Facebook(OS os) 
    {
        this.os = os;
    }

    @Override
    public void start()
    {
        if(!os.getState())
            os.startUp();
        
        if(os.getCurrentApp().equals(name))
            System.out.println("" + name + " is already started.");
        else
            os.openApp(name);
    }

    @Override
    public void pause()
    {
        if(!os.getState())
            os.startUp();
        if(os.getCurrentApp().equals(name))
            os.pauseApp(name);
        else 
            System.out.println("" + name + " can not be paused.");
    }

    @Override
    public void close()
    {
        if(!os.getState())
            os.startUp();
        os.closeApp(name);
    }
}