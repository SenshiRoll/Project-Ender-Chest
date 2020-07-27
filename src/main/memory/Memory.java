package main.memory;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class Memory<K,V> extends AbstractMap<K,V> implements Map<K,V>, Serializable {
	Node<K,V>[] memory;
	private static final long serialVersionUID = 117578722165722509L;
	public Memory(int size) {
		this.memory=new Node<K,V>[size];
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
    
}