import java.util.*;
/*
 * Every time a new instance of an "ender chest" is created in the world, it runs on a thread of solely ender chests
 * this ensures processing order as well as having no interference with the main system
 */
public class Ender_Chest { 
	public static ArrayList<String> itemsAvaliable=new ArrayList<String>();
	public Ender_Chest() {
	//whenever a new instance is created, it takes all of the the set items in storage and sends them to the new instance
		Main.extract();
	}
	
	public infoPackage processPackage() {
		Scanner in=new Scanner(System.in);
		String[] userIn=in.nextLine().trim().split(";");
		if (userIn.length!=3) {
			System.out.print("Invalid Input");//not system, just coding
			userIn=new String[] {"E"};
		} else {userIn[2].toLowerCase().replace(" ","_");}
		in.close();
		infoPackage info = new infoPackage(userIn);
		return info;
	}

	/* @Override
	public void run() {
		Main.packages.add(doTheThing());
	} */
}
