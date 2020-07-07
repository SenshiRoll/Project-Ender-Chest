package src;
import java.util.ArrayList;

public class Main {
	public static ArrayList<infoPackage> superPacket=new ArrayList<infoPackage>();
	public static ArrayList<networkConnection> connections=new ArrayList<networkConnection>();
	static Encoder en=new Encoder(0x500);
	static int[][] stor=new int[0b10][0x500];
	
	public static void main(String[] args) {
		BlockId.build();
		Thread network=new Thread() {
			public void run() {
				for(int i=0;i<connections.size();i++) {
						connections.get(i).run();
				}
			}
		};
		while(true) {
			network.run();
			for(int i = 0;i<superPacket.size();i++) {
				if (superPacket.get(i).action=='D') {deposit(superPacket.get(i).item,superPacket.get(i).amount);} else if(superPacket.get(i).action=='W') {withdraw(superPacket.get(i).item,superPacket.get(i).amount);} // there it is, that's the entire storage process, one line
			}
		}
	}
	public static void withdraw(Item item,int amount) {
		int code=en.getCode(item);
		if (stor[1][code]==0) {amount=stor[0][code];stor[0][code]=0;return;}
		stor[1][code]-=amount;
		amount*=1728;
		System.out.print("You have been given "+amount+" "+item);
	}
	public static void deposit(Item item,int amount) {
		int code=Encoder.autoEncoder(item);
		deposit(code,amount);
	}
	private static void deposit(int code, int amount) {
		stor[1][code]+=amount/1728;
		deposit(code,(amount%1728)+stor[0][code]);
	}
	public static void extract() {
		//an extraction for the interfaces that can synchronize the inventory through communication with the interfaces, part of network implementation
	}
	public static boolean contains(Item item) {
		if(stor[1][en.encoder(item)]==0) {return false;}else {return true;}
	}
}

