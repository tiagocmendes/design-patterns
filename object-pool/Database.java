public class Database
{
    private static int dbObject;
    private int dbNumber;
    private Type type;

    public Database(Type type)
    {
        this.dbNumber = ++dbObject;
        this.type = type;
    }

    public Type getType() { return type; }

    @Override
    public String toString()
    {
        return "Database number: " + dbNumber + ", Type: " + type;
    }
}