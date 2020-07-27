package main.java.io.github.senshiRoll.projectEnderChest.memory;

import main.java.io.github.senshiRoll.projectEnderChest.item.Item;

public class Encoder {
	static Item[] itemCodes;

	public Encoder(int size) {
		itemCodes = new Item[size];
	}

	public Item getItem(int code) {
		return itemCodes[code];
	}

	public int getCode(Item item) {
		int itemIndex = 0;
		for (int i = 0; i < itemCodes.length; i++) {
			if (itemCodes[i].equals(item)) {
				itemIndex = i;
			}
		}
		return itemIndex;
	}

	public static int autoEncoder(Item item) {
		int code = 0;
		for (int i = 0; i < itemCodes.length; i++) {
			if (itemCodes[i].equals(item)) {
				code = i;
			} else if (itemCodes[i].isEmpty()) {
				code = i;
			}
		}
		itemCodes[code] = item;
		return code;
	}

	public void assign(Item item, int code) {
		itemCodes[code] = item;
	}

	public int encoder(Item item) {
		int code = 0;
		for (int i = 0; i < itemCodes.length; i++) {
			if (itemCodes[i].equals(item)) {
				code = i;
			}
		}
		return code;
	}
}

