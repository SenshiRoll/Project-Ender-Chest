package main.java.io.github.senshiRoll.projectEnderChest.network;

import main.java.io.github.senshiRoll.projectEnderChest.Main;
import main.java.io.github.senshiRoll.projectEnderChest.infoPackage;

public abstract class networkConnection implements Runnable {
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
