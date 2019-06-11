public abstract class State
{
    Process process;
    private String designation;
    

    public State(Process process, String designation)
    {
        this.process = process;
        this.designation = designation;
    }

    public String getDesignation() { return designation; }

    public abstract String next();
    public abstract String previous();
}