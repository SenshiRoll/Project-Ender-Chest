
public abstract class networkConnection implements Runnable{
	public infoPackage info;
	abstract infoPackage createPackage();
	abstract void receivePackage(infoPackage info);
	public void run() {
		info=this.createPackage(); this.sendPackage();
	}
	void sendPackage() {
		Main.superPacket.add(info);
	}
}
