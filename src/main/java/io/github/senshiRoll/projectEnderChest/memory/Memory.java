package io.github.senshiRoll.projectEnderChest.memory;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Memory<K,V> extends AbstractMap<K,V> implements Serializable {
	Node<K, V> memory;
	private static final long serialVersionUID = 117578722165722509L;
	public Memory(int size) {
		this.memory=new Node<K,V>();
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
    static class Node<K,V> implements Map.Entry<K, V> {

		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public V getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public V setValue(V value) {
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
    public V get(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V put(K key, V value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public V remove(Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        // TODO Auto-generated method stub

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public Set<K> keySet() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<V> values() {
        // TODO Auto-generated method stub
        return null;
    }
    
}