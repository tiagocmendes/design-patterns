public interface OS
{   
    String getCurrentApp();
    boolean getState();
    void startUp();
    void shutDown();
    void openApp(String app);
    void pauseApp(String app);
    void closeApp(String app);
}