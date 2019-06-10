public class ProgrammingPC
{
    private String processor;
    private int ram;
    private Disk disk;
    private int memory;
    private String graphics;
    private double autonomy;
    private String os;

    public ProgrammingPC(String processor, int ram, Disk disk, int memory, String graphics, double autonomy, String os)
    {
        this.processor = processor;
        this.ram = ram;
        this.disk = disk;
        this.memory = memory;
        this.graphics = graphics;
        this.autonomy = autonomy;
        this.os = os;
    }

    @Override 
    public String toString()
    {
        return "" + processor + "," + ram + "," + disk + "," + memory + "," + graphics + "," + autonomy + "," + os;
    }
}