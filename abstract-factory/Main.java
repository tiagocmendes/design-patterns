public class Main 
{
    public static void main(String[] args) {
        
        if(args.length != 1)
            throw new IllegalArgumentException();
        
        Process p1 = new Process("bash");
        Process p2 = new Process("python3");
        Process p3 = new Process("firefox");

        FactoryOS factoryOS = null;
        switch(args[0])
        {
            case "windows":
                factoryOS = new WindowsFactory();
                break;

            case "mac":
                factoryOS = new MacOSFactory();
                break;

            case "linux":
                factoryOS = new LinuxFactory();
                break;

            default:
                throw new IllegalArgumentException();
        }

        OS os = factoryOS.installOS("1.0");

        os.load();
        os.startProcess(p1);
        os.startProcess(p2);
        os.startProcess(p3);
        os.pauseProcess(p1);
        os.finishProcess(p2);
        os.finishProcess(p1);
        os.shutDown();

        if(factoryOS.uninstallOS(os))
            System.out.println("OS uninstalled with success!");
        
    }
}