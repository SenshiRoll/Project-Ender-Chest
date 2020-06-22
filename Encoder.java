import java.util.*;
public class Encoder {
static ArrayList<itemCoded> itemCodes=new ArrayList<itemCoded>();
public Encoder() {}
	public String getItem(int code) {
		String item = null;
		for (int i=0;i<itemCodes.size();i++) {
			if (itemCodes.get(i).code == code) {
				item=itemCodes.get(i).name;
			}
		}
		return item;
	}
	private static int findCode(String item) {
		int itemIndex=0;
		for(int i=0;i<itemCodes.size();i++) {
			if (itemCodes.get(i).name.equals(item)) {
				itemIndex=itemCodes.get(i).code;
			}
		}
		return itemIndex;
	}
	public int getCode(String item) {
		int itemIndex=0;
		for(int i=0;i<itemCodes.size();i++) {
			if (itemCodes.get(i).name.equals(item)) {
				itemIndex=itemCodes.get(i).code;
			}
		}
		return itemIndex;
	}
	public static int autoEncoder(String item) {
		int code;
			if (contains(item)==true) {
				code=findCode(item);
			} else {
				code=itemCodes.size();
				itemCodes.add(new itemCoded(item,code));
			}
			return code;
		}
	private static boolean contains(String item) {
		boolean contains=false;
		for(int i=0;i<itemCodes.size();i++) {
			if (itemCodes.get(i).name.equals(item)) {contains=true;}
		}
		return contains;
	}
	public void add(itemCoded item) {
		itemCodes.add(item);
	}
}

