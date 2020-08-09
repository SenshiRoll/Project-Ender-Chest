package PEC.item;

public class Item {
    private String id;
    private String name;
    private String nbt;

    public Item(String id, String name, String nbt) {
        this.id = id;
        this.name = name;
        this.nbt = nbt;
    }

    public Item(String id, String name) {
        this(id, name, "");
    }

	public Item(String id) {
        this(id, id, "");
    }
	
    public void setName(String name) {
        this.name = name;
    }

    public void setNbt(String nbt) {
        this.nbt = nbt;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNbt() {
        return nbt;
    }

    public String toString() {
        return String.format("Item:[Id : %s, Amount : %s, ItemInfo : %s{%s}]", this.id, this.name, this.nbt);
    }

	public boolean isEmpty() {
		return id==null;
	}

    /*
    @Override
    public int hash(){  //unimplemented
        return 0;
    }
    */

}
