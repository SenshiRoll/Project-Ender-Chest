package io.github.senshiRoll.projectEnderChest.memory;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import io.github.senshiRoll.projectEnderChest.item.Item;

public class Encoder implements Map {
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

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}

