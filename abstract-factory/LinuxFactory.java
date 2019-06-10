public class LinuxFactory implements FactoryOS
{
    public OS installOS(String version)
    {
        System.out.println("Linux installed!");
        return new Linux(version);
    }
    
    public boolean uninstallOS(OS os)
    {
        if(os == null)
            return false;
        os = null;
        System.out.println("Linux uninstalled!");
        return true;
    }
}