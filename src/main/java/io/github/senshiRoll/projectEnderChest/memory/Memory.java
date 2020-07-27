package main.java.io.github.senshiRoll.projectEnderChest.memory;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Memory<Key,Value> extends AbstractMap<Key,Value> implements Serializable {
	Node<Key, Value> memory;
	private static final long serialVersionUID = 117578722165722509L;
	public Memory(int size) {
		this.memory=new Node<Key,Value>();
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
    static class Node<Key,Value> implements Map.Entry<Key, Value> {

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
    
}