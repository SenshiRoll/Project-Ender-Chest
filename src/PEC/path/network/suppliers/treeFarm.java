package PEC.path.network.suppliers;

import PEC.item.Item;
import PEC.path.infoPackage;
import PEC.path.network.Network;
import PEC.path.network.networkConnection;
/**
 * A tree farm exists in the network \o/
 * <p>This class exists to showcase the logic required to add a component to the network and needs extensive updates
 * since the system has progressed past when this was made.
 * @author senshi
 *
 */
public class treeFarm implements networkConnection {
	private Item bone_meal = new Item("bone_meal","Bone Meal");
	private boolean hasBoneMeal;
	private int boneMealNeeded;
	private Item output;
	private int storageSize;
	private boolean isFull;
	public Network net;
	
	public treeFarm(Item woodType, int storage, Network local) {
		this.output=woodType;
		this.storageSize=storage;
		this.net=local;
		net.net.add(this);
	}

	public infoPackage createPackage() {
		return new infoPackage('D', output, storageSize);
	}

	public void run() {
		if (hasBoneMeal == false) 
			this.net.net.get(0).receivePackage(new infoPackage('W',bone_meal,boneMealNeeded));
		if (isFull = true)
			this.net.net.get(0).receivePackage(this.createPackage()); isFull=false;
	}

	public void receivePackage(infoPackage info) {
		hasBoneMeal = true;
	}
}
