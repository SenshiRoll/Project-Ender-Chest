import java.util.*;
/*
 * Every time a new instance of an "ender chest" is created in the world, it runs on a thread of solely ender chests
 * this ensures processing order as well as having no interference with the main system
 */
public class userInterface implements Runnable{
	public static ArrayList<String> itemsAvaliable=new ArrayList<String>();
	public userInterface() {
	//whenever a new instance is created, it takes all of the the set items in storage and sends them to the new instance
		Main.extract();
	}
	public infoPackage createPackage() {
		Scanner in=new Scanner(System.in);
		String[] userIn=in.nextLine().trim().split(";");
		in.close();
		infoPackage info = null;
		switch(userIn.length) {
		//case 2: info=new infoPackage(userIn[0].charAt(0),userIn[1]); //needs turned into items
		//case 3: info=new infoPackage(userIn[0].charAt(0),userIn[1],Integer.parseInt(userIn[2])); //needs turned into items
		default: System.out.println("Invalid Argument"); info=this.createPackage(); break;
		}
		return info;
	}
	public void run() {
		Main.superPacket.add(this.createPackage());
	}
}
