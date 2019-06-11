import java.util.ArrayList;
public class EmailSubscriber implements Subscriber
{
    private ArrayList<String> receivedEmails = new ArrayList<>();
    private static int idCounter;
    private int id = ++idCounter;

    @Override
    public String toString()
    {
        return "EmailSubscriber " + id;
    }

    public void update(String newEvent)
    {
        if(!receivedEmails.contains(newEvent))
        {
            receivedEmails.add(newEvent);
            System.out.println("Received new email! Content: " + newEvent);
        }
    }

    public void allEmails()
    {
        System.out.println("All emails: ");
        receivedEmails.forEach((String e) -> System.out.println(e));
    }
}