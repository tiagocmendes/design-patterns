public class Main 
{
    public static void main(String[] args) {
        
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();
        System.out.println(dbc1);
        System.out.println(dbc2);
    }
}