package PEC.item;

import java.util.HashMap;
import java.util.Map;

public final class BlockId {
	//store block ids to create items easier
	public static Map<String,String> Id=new HashMap<>(0x500);
	public static void build(){
		Id.put("stone","Stone");

	}

}
