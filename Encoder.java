
public class Encoder {
	static String[] itemCodes;
	public Encoder(int size) {
		itemCodes=new String[size];
	}
	public String getItem(int code) {
		return itemCodes[code];
	}
	public int getCode(String item) {
		int itemIndex=0;
		for(int i=0;i<itemCodes.length;i++) {
			if (itemCodes[i].equals(item)) {
				itemIndex=i;
			}
		}
		return itemIndex;
	}
	public static int autoEncoder(String item) {
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
	public void assign(String item,int code) {
		itemCodes[code]=item;
	}
}

