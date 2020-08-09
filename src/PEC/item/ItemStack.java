package PEC.item;

public class ItemStack {
	public Item item;
	public byte count;
	public ItemStack(String id, String name, String nbt, byte count) {
		this.item=new Item(id, name, nbt);
		this.count=count;
	}

}
