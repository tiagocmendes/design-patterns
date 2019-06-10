public interface Builder
{
    void setProcessor(String processor);
    void setRAM(int ram);
    void setDisk(Disk disk);
    void setMemory(int memory);
    void setGraphics(String graphics);
    void setAutonomy(double autonomy);
    void setOS(String os);
}