public interface FactoryOS
{
    public OS installOS(String version);
    public boolean uninstallOS(OS os);
}