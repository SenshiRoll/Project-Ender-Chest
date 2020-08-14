package PEC.path;

import java.util.ArrayList;

import PEC.item.BlockId;
import PEC.path.network.Network;
import PEC.path.network.networkConnection;

/**
 * Main class from where the system runs, the central control system in MC. Main has its own {@link Memory} and
 * collection of network connections through a larger network. It is where the master {@link userInterface} exists
 * acting as a console. Main technically has the ability to have direct {@link networkConnection}s feeding in, but
 * it is unsafe for normal implementation.(no connection yet)
 * <p> The central control system will likely be where overflow bulk is too, but that doesn't exist yet.
 * @author senshi
 *
 */
public class Main {
	public static ArrayList<Network> world=new ArrayList<Network>();
	@SuppressWarnings("rawtypes")
	public Memory system;
	public static void main(String[] args) {
		BlockId.build();
		Thread server=new Thread() {
			public void run() {
				for(Network n : world) 
					n.run();
			}
		};
		while(true)
			server.run();
	}

}
