import java.util.ArrayList;

public class Android implements OS
{
    private boolean on = false;
    private String currentApp = "None";
    private ArrayList<String> pausedApps = new ArrayList<>();

    @Override
    public boolean getState()
    {
        return on;
    }

    @Override
    public String getCurrentApp()
    {
        return currentApp;
    }

    @Override
    public void startUp()
    {
        on = true;
        System.out.println("Android is starting up.");
    }

    @Override
    public void shutDown()
    {
        on = false;
        System.out.println("Android is shutting down.");
    }

    @Override
    public void openApp(String app)
    {   
        currentApp = app;
        if(pausedApps.contains(app))
            pausedApps.remove(app);
        System.out.println("Opening " + currentApp + " application.");
    }

    @Override
    public void pauseApp(String app)
    {
        currentApp = "None";
        if(!pausedApps.contains(app))
            pausedApps.add(app);
        System.out.println("Pausing " + app + " application.");
    }
    
    @Override
    public void closeApp(String app)
    {
        currentApp = "None";
        if(pausedApps.contains(app))
        {
            pausedApps.remove(app);
            System.out.println("Closing " + app + " application.");
        }
        else
            System.out.println("" + app + " can not be closed.");
    }
}