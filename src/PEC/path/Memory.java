package PEC.path;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
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

		@Override
		public Key getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Value getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Value setValue(Value value) {
			// TODO Auto-generated method stub
			return null;
		}
    	
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
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

    @Override
    public Value get(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Value put(Key key, Value value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Value remove(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putAll(Map<? extends Key, ? extends Value> m) {
        // TODO Auto-generated method stub

    }

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