public class WindowsFactory implements FactoryOS
{
    public OS installOS(String version)
    {
        System.out.println("Windows installed!");
        return new Windows(version);
    }
    
    public boolean uninstallOS(OS os)
    {
        if(os == null)
            return false;
        os = null;
        System.out.println("Windows uninstalled!");
        return true;
    }
}