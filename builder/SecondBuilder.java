public class SecondBuilder implements Builder
{
    private String processor;
    private int ram;
    private Disk disk;
    private int memory;
    private String graphics;
    private double autonomy;
    private String os;

    @Override
    public void setProcessor(String processor)
    {
        this.processor = processor;
    }

    @Override
    public void setRAM(int ram)
    {
        this.ram = ram;
    }
    
    @Override
    public void setDisk(Disk disk)
    {
        this.disk = disk;
    }

    @Override
    public void setMemory(int memory)
    {
        this.memory = memory;
    }

    @Override
    public void setGraphics(String graphics)
    {
        this.graphics = graphics;
    }

    @Override
    public void setAutonomy(double autonomy)
    {
        this.autonomy = autonomy;
    }

    @Override
    public void setOS(String os)
    {
        this.os = os;
    }

    public ProgrammingPC getResult()
    {
        return new ProgrammingPC(processor, ram, disk, memory, graphics, autonomy, os);
    }
}