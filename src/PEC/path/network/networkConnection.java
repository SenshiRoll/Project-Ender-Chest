package PEC.path.network;

import PEC.path.infoPackage;

public interface networkConnection extends Runnable {
	abstract infoPackage createPackage();
	abstract void receivePackage(infoPackage info);
	public void run();
}
