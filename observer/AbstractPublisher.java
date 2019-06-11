import java.util.ArrayList;
public abstract class AbstractPublisher implements Publisher
{
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private String eventType;

    public AbstractPublisher(String eventType)
    {
        this.eventType = eventType;
    }

    @Override
    public void subscribe(Subscriber s) 
    {
        if(!subscribers.contains(s))
            subscribers.add(s);
        System.out.println("" + s + " has subscribed " + eventType + " events");
    }

    @Override
    public void unsubscribe(Subscriber s) 
    {
        if(subscribers.contains(s))
            subscribers.remove(s);
        System.out.println("" + s + " has unsubscribed " + eventType + " events");
    }

    @Override
    public void notifySubscribers(String newEvent) 
    {
        for (Subscriber s : subscribers)
            s.update(newEvent);
            
        System.out.println("Notified all subscribers.");
        System.out.println("Subscribers list: " + subscribers);
    }

}