package main.memory;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class Memory<K,V> extends AbstractMap<K,V> implements Map<K,V>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 117578722165722509L;

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}