package PEC.item;

public class ItemStack {
	public Item item;
	public byte count;
	public ItemStack(Item item, byte count) {
		this.item=item;
		this.count=count;
	}
	public ItemStack(String id, String name, String nbt, byte count) {
		this(new Item(id,name,nbt),count);
	}
}
