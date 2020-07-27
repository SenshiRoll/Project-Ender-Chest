
public class Item {
    private long id;
    private byte count;
    private String name;
    private String nbt;

    public Item(long id, byte count, String name, String nbt) {
        this.id = id;
        this.count = count;
        this.name = name;
        this.nbt = nbt;
    }

    public Item(long id, String name, String nbt) {
        this(id, (byte)1, name, nbt);
    }

    public Item(long id, String name) {
        this(id, name, "");
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCount(byte count) {
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
    @Override
    public int hash(){  //unimplemented
        return 0;
    }

}
