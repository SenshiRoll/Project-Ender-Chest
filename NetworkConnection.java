public abstract class NetworkConnection implements Runnable {
    
    abstract void recievePackage(infoPackage info);

    public infoPackage createInfoPackage(char action,Item item,int amount) {
        return new infoPackage(action, item, amount);
    }

}