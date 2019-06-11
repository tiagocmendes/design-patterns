public class Process
{
    private State processState;

    public Process()
    {
        this.processState = new NewState(this);
    }

    public void changeState(State processState)
    {
        this.processState = processState;
    }

    public State getState()
    {
        return processState;
    }

    public void nextState()
    {
        System.out.println("Next process state from " + processState.getDesignation() + " to " + processState.next());
    }

    public void previousState()
    {
        System.out.println("Previous process state from " + processState.getDesignation() + " to " + processState.previous());
    }
}