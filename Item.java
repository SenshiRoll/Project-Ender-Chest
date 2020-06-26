
public class Item {
    byte id;
    byte count;
    String name;
    String nbt;

    public Item(byte id, byte count, String name, String nbt) {
        this.id = id;
        this.count = count;
        this.name = name;
        this.nbt = nbt;
    }

    public Item(byte id, String name, String nbt) {
        this(id, (byte)1, name, nbt);
    }

    public Item(byte id, String name) {
        this(id, name, "");
    }

    public void setId(byte id) {
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

}
