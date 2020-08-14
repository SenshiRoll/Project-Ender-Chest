package PEC.path.network.suppliers;

import java.util.Scanner;

import PEC.item.BlockId;
import PEC.item.Item;
import PEC.path.infoPackage;
import PEC.path.network.Network;
import PEC.path.network.networkConnection;
/**
 * Every time a new instance of an "ender chest" is created in the world, it runs on a thread of solely ender chests
 * this ensures processing order as well as having no interference with the main system
 * <p> also needs extensive updates after multiple system updates
 * @see treeFarm
 * 
 */
public class userInterface implements networkConnection {
	private static Scanner in;
	Network local;
	
	public userInterface(Network net) {
		in=new Scanner(System.in);
		this.local=net;
		net.net.add(this);
	}
	public infoPackage createPackage() {
		String[] userIn=in.nextLine().trim().split(";");
		infoPackage info = null;
		switch(userIn.length) {
		case 2: info=new infoPackage(userIn[0].toUpperCase().charAt(0),new Item(BlockId.Id.get(userIn[1]),userIn[1]));
		case 3: info=new infoPackage(userIn[0].toUpperCase().charAt(0),new Item(BlockId.Id.get(userIn[1]),userIn[1]),Integer.parseInt(userIn[2]));
		default: System.out.println("Invalid Argument"); info=this.createPackage(); break;
		}
		return info;
	}
	public void run() {
		//no idea how to not spam the thread tbh
		this.local.net.get(0).receivePackage(this.createPackage());
	}
	@Override
	public void receivePackage(infoPackage info) {
		playerInteract(info.item);
	}

	private void playerInteract(Item item) {
		System.out.println(item);
		System.out.println("What would you like to do with the item? (D/W); D = deposit. W = Withdraw");

		String action = in.nextLine();
		char parsedAction = action.toUpperCase().charAt(0);

		if(parsedAction == 'D') {
			depositItem(item);
		} else if (parsedAction == 'W') {
			withdrawItem(item);
		} else {
			System.out.println("Error, Incorrect Input: Please enter either a W or a D for your action.");
			playerInteract(item);
		}
	}

	private void depositItem(Item item) {

	}

	private void withdrawItem(Item item) {
		System.out.println("How many would you like to take?");
		short amnt = in.nextShort();

		//Item withdrawnItem = item.take(amnt);
		//System.out.println("Your item :\n" + withdrawnItem);
	}
}
