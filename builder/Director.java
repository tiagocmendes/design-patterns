public class Director
{
    private Builder b;

    public void changeBuilder(Builder b)
    {
        this.b = b;
    }

    public void make()
    {
        String processor = null;
        int ram;
        Disk disk = null;
        int memory;
        String graphics = null;
        double autonomy;
        String os = null;

        if(b.getClass().getName().equals("FirstBuilder"))
        {
            System.out.println("Build a gaming computer!");
            processor = "Intel Core i7";
            ram = 32;
            disk = Disk.HDD;
            memory = 1024;
            graphics = "NVidia 1080 TI";
            autonomy = 10.5;
            os = "Windows";
        }
        else
        {
            System.out.println("Build a programming computer!");
            processor = "Intel Core i5";
            ram = 8;
            disk = Disk.SSD;
            memory = 256;
            graphics = "NVidia 920MX";
            autonomy = 4.3;
            os = "Linux";
        }

        b.setProcessor(processor);
        b.setRAM(ram);
        b.setDisk(disk);
        b.setMemory(memory);
        b.setGraphics(graphics);
        b.setAutonomy(autonomy);
        b.setOS(os);
    }

}