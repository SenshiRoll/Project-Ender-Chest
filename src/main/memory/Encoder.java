import java.util.maps.Map;

public class Encoder implements Map{
	static Item[] itemCodes;
	public Encoder(int size) {
		itemCodes=new Item[size];
	}
	public Item getItem(int code) {
		return itemCodes[code];
	}
	public int getCode(Item item) {
		int itemIndex=0;
		for(int i=0;i<itemCodes.length;i++) {
			if (itemCodes[i].equals(item)) {
				itemIndex=i;
			}
		}
		return itemIndex;
	}
	public static int autoEncoder(Item item) {
		int code = 0;
		for (int i=0;i<itemCodes.length;i++) {
			if(itemCodes[i].equals(item)) {
				code=i;
			} else if (itemCodes[i].isEmpty()) {
				code=i;
			}
		}
		itemCodes[code]=item;
		return code;
	}
	public void assign(Item item,int code) {
		itemCodes[code]=item;
	}
	public int encoder(Item item) {
		int code=0;
		for (int i=0;i<itemCodes.length;i++) {
			if(itemCodes[i].equals(item)) {
				code=i;
			}
		}
		return code;
	}
}

