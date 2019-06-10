import java.util.List;
import java.util.ArrayList;
public class ObjectPool
{
    private ArrayList<Database> objectPool;

    public ObjectPool()
    {
        objectPool = new ArrayList<>();
    }

    public Database getInstance(Type t)
    {
        for(Database db : objectPool)
            if(db.getType().equals(t))
                return acquireDatabase(db);
        
        Database db = new Database(t);
        System.out.println("Creating new database of type " + t);
        releaseDatabase(db);
        return acquireDatabase(db);
    }

    public Database acquireDatabase(Database db)
    {
        System.out.println("Acquiring database " + db);
        objectPool.remove(db);
        return db;
    }

    public void releaseDatabase(Database db)
    {
        System.out.println("Releasing database " + db);
        objectPool.add(db);
    }
}