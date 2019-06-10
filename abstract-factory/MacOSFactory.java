public class MacOSFactory implements FactoryOS
{
    public OS installOS(String version)
    {
        System.out.println("MacOS installed!");
        return new MacOS(version);
    }
    
    public boolean uninstallOS(OS os)
    {
        if(os == null)
            return false;
        os = null;
        System.out.println("MacOS uninstalled!");
        return true;
    }
}