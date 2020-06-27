
public class treeFarm extends networkConnection implements Runnable{
	private Item bone_meal=new Item((byte)0,"bone_meal");//0 is a placeholder right now
	private boolean hasBoneMeal;
	private int boneMealNeeded;
	private Item output;
	private int storageSize;
	private boolean isFull;
	infoPackage createPackage() {
		return new infoPackage('D',output,storageSize);
	}
	@Override
	public void run() {
		if (hasBoneMeal==false) {Main.superPacket.add(new infoPackage('W',bone_meal,boneMealNeeded));}
		if (isFull=true) {Main.superPacket.add(this.createPackage());isFull=false;}
	}
	void receivePackage(infoPackage info) {
		hasBoneMeal=true;
	}
}
