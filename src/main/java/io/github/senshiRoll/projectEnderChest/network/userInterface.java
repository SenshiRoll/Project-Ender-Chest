package main.java.io.github.senshiRoll.projectEnderChest.network;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.io.github.senshiRoll.projectEnderChest.Main;
import main.java.io.github.senshiRoll.projectEnderChest.infoPackage;
import main.java.io.github.senshiRoll.projectEnderChest.item.BlockId;
import main.java.io.github.senshiRoll.projectEnderChest.item.Item;
/*
 * Every time a new instance of an "ender chest" is created in the world, it runs on a thread of solely ender chests
 * this ensures processing order as well as having no interference with the main system
 */
public class userInterface extends networkConnection {
	public static ArrayList<String> itemsAvaliable=new ArrayList<String>();
	private static Scanner in;
	
	public userInterface() {
		in=new Scanner(System.in);
		//whenever a new instance is created, it takes all of the the set items in storage and sends them to the new instance
		Main.extract();
	}
	public infoPackage createPackage() {
		String[] userIn=in.nextLine().trim().split(";");
		infoPackage info = null;
		switch(userIn.length) {
		case 2: info=new infoPackage(userIn[0].charAt(0),new Item(BlockId.Id.get(userIn[1]),userIn[1]));
		case 3: info=new infoPackage(userIn[0].charAt(0),new Item(BlockId.Id.get(userIn[1]),userIn[1],Integer.parseInt(userIn[2])));
		default: System.out.println("Invalid Argument"); info=this.createPackage(); break;
		}
		return info;
	}
	public void run() {
		super.run();
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

		Item withdrawnItem = item.take(amnt);
		System.out.println("Your item :\n" + withdrawnItem);
	}
}
