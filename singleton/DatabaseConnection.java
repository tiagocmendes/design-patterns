public class DatabaseConnection
{
    private static DatabaseConnection dbConnection;
    private String dbServer;
    private String dbName;
    private String userName;
    private String userPass;
    private static int reused;

    private DatabaseConnection()
    {
        this.dbServer = "tcp:mednat.randomserver.pt\\SQLSERVER,8101";
        this.dbName = "DesignPatterns";
        this.userName = "tiagocmendes";
        this.userPass = "mypassword";
        System.out.println("Creating new database connection.");
    }

    public static DatabaseConnection getInstance()
    {
        if(dbConnection == null)
            dbConnection = new DatabaseConnection();
        System.out.println("Returning database connection instance. Reused " + reused++ + " times.");
        return dbConnection;
    }

    @Override
    public String toString()
    {
        return "Database connection [server: " + dbServer + ", name: " + dbName + ", username: " + userName + ", password: " + userPass + "];";
    }
}