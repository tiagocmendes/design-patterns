public interface OS
{
    public void load();
    public void shutDown();
    public void startProcess(Process p);
    public void pauseProcess(Process p);
    public void finishProcess(Process p);
}