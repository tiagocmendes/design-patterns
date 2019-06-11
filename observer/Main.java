public class Main 
{
    public static void main(String[] args) {
        
        Subscriber s1 = new EmailSubscriber();
        Subscriber s2 = new EmailSubscriber();
        Subscriber s3 = new EmailSubscriber();

        Publisher p = new EmailPublisher();

        p.subscribe(s1);
        p.subscribe(s2);
        p.subscribe(s3);

        p.notifySubscribers("First email!");

        p.unsubscribe(s2);

        p.notifySubscribers("Second email!");

    }
}