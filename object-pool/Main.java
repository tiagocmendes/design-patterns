public class Main 
{
    public static void main(String[] args) {
        
        ObjectPool objectPool = new ObjectPool();

        Database textDB = objectPool.getInstance(Type.TEXT);
        System.out.println(textDB);
        objectPool.releaseDatabase(textDB);

        Database textDB2 = objectPool.getInstance(Type.TEXT);
        System.out.println(textDB2);

        Database imageDB = objectPool.getInstance(Type.IMAGES);
        System.out.println(imageDB);

        Database imageDB2 = objectPool.getInstance(Type.IMAGES);
        System.out.println(imageDB2);

        objectPool.releaseDatabase(imageDB);
        objectPool.releaseDatabase(imageDB2);

        Database imageDB3 = objectPool.getInstance(Type.IMAGES);
        System.out.println(imageDB3);

        Database gamesDB = objectPool.getInstance(Type.GAMES);
        System.out.println(gamesDB);
    }
}