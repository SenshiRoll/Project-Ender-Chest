package PEC.path;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

import PEC.item.Item;
import PEC.item.ItemStack;
import PEC.path.network.networkConnection;

/**
 * Custom {@link HashMap} class for efficient storage of {@link Item}s in {@link Box} cells.
 * <p>Last update: can be instanced and exist as its own satellite
 * @author senshi
 * @see Memory#hash(ItemStack)
 * @param <Key>
 * @param <Value>
 * @TODO actually making it work
 */
public class Memory<Key,Value> extends AbstractMap<Key,Value> implements networkConnection {
	Cell<Key, Value>[] memory;
	Item[] I;
	ArrayList<infoPackage> superPacket;
	@SuppressWarnings("unchecked")
	public Memory(int size) {
		this.memory=new Cell[size];
		this.I=new Item[size];
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
    static class Cell<Key,Value> implements Map.Entry<Key, Value> {
        final int hash;
        final Key key;
        Value value;
        
        Cell(int hash, Key key, Value value){
        	this.hash=hash;
        	this.key=key;
        	this.value=value;
        }

		public Key getKey() {
			return key;
		}

		public Value getValue() {
			return value;
		}

		public Value setValue(Value value) {
			Value v=this.value;
			this.value=value;
			return v;
		}
    	
    }

    public int size() {
        return this.memory.length;
    }

    public boolean isEmpty() {
        return this.memory.length==0;
    }

    @Override
    public boolean containsKey(Object key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Okay let me tell you a story about this one, since java is insistent on generalizing methods for data
     * structures and that's not going to fly here. In order to make this method work for items, it has a
     * conditional and a cast, and took longer than I care to admit.
     */
    public Value get(Object key) {
    	Cell<Key,Value> e; Value v=null;
    	//h=key instanceof ItemStack ? hash((ItemStack)key) : null;
        try {
			v=(e = getNode(hash((ItemStack)key), key)) == null ? null : e.value;
		} catch (Exception e1) {
			// TODO Auto-generated catch block, hopefully it's just for safety
			e1.printStackTrace();
		}
        return v;
    }
    
    Cell<Key, Value> getNode(int hash, Object key){
    	Cell<Key,Value> c;
    	c=this.memory[hash].getKey().equals(key) ? this.memory[hash] : null;
    	return c;
    }

    public Value put(Key key, Value value) {
		return value;
    	
    }

    @Override
    public Value remove(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    //AbstractMap artifact
    public void putAll(Map<? extends Key, ? extends Value> m) {}

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public Set<Key> keySet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Value> values() {
        // TODO Auto-generated method stub
        return null;
    }

	@Override
	public infoPackage createPackage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void receivePackage(infoPackage info) {
		this.superPacket.add(info);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <p>Incredibly lazy normal encoding method for "hashing" until we find a better method. 
	 * While the parameter is a stack, it is mostly for convenience right now
	 * @TODO more efficient method and box logic
	 * @param ItemStack object  
	 * @return int for indexing purposes
	 * @throws Exception
	 */
	private int hash(ItemStack item) throws Exception {
		for(int i=0;i<I.length;i++) {
			if(I[i].equals(item.item))
				return i;
			else if(I[i].isEmpty() && (I[i-1].isEmpty()==false))
				return i;
		}
		throw new Exception("MemoryFullException");
	}
    
}