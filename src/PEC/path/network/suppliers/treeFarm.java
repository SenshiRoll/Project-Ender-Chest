package PEC.path.network.suppliers;

import PEC.item.Item;
import PEC.path.Main;
import PEC.path.infoPackage;
import PEC.path.network.networkConnection;
/**
 * A tree farm exists in the network \o/
 * <p>This class exists to showcase the logic required to add a component to the network and needs extensive updates
 * since the system has progressed past when this was made.
 * @author senshi
 *
 */
public class treeFarm implements networkConnection {
	private Item bone_meal = new Item((byte) 0, "bone_meal");// 0 is a placeholder right now
	private boolean hasBoneMeal;
	private int boneMealNeeded;
	private Item output;
	private int storageSize;
	private boolean isFull;

	infoPackage createPackage() {
		return new infoPackage('D', output, storageSize);
	}

	public void run() {
		if (hasBoneMeal == false) {
			Main.superPacket.add(new infoPackage('W', bone_meal, boneMealNeeded));
		}
		if (isFull = true) {
			Main.superPacket.add(this.createPackage());
			isFull = false;
		}
	}

	void receivePackage(infoPackage info) {
		hasBoneMeal = true;
	}
}
