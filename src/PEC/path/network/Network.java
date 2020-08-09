package PEC.path.network;

import java.util.ArrayList;

import PEC.item.Box;
import PEC.item.Item;
import PEC.path.Memory;

public class Network {
	public ArrayList<networkConnection> net;
	public Network(int size) {
		this.net=new ArrayList<networkConnection>();
		this.net.add(0,new Memory<Item,Box[]>(size));
	}
	public void add(networkConnection n) {
		this.net.add(n);
	}
}
