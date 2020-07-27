package io.github.senshiRoll.projectEnderChest.item;

public class Item {
    private byte id;
    private short count;
    private String name;
    private String nbt;

    public Item(byte id, short count, String name, String nbt) {
        this.id = id;
        this.count = count;
        this.name = name;
        this.nbt = nbt;
    }

    public Item(byte id, String name, String nbt) {
        this(id, (short)1, name, nbt);
    }

    public Item(byte id, String name) {
        this(id, name, "");
    }

	public Item(Byte byte1, String string, int parseInt) {
        this(byte1, (short)parseInt, string, "");
    }

	public void setId(byte id) {
        this.id = id;
    }

    public void setCount(short count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNbt(String nbt) {
        this.nbt = nbt;
    }

    public byte getId() {
        return id;
    }

    public short getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getNbt() {
        return nbt;
    }
    
    public boolean isEmpty() {
    	return this.id==0;
    }

    public String toString() {
        return String.format("Item:[Id : %s, Amount : %s, ItemInfo : %s{%s}]", this.id, this.count, this.name, this.nbt);
    }

    public Item take(short amount) {
        this.count -= amount;
        return new Item(this.id, amount, this.name, this.nbt);
    }

    /*
    @Override
    public int hash(){  //unimplemented
        return 0;
    }
    */

}
