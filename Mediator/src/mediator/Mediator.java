package mediator;

import java.util.HashMap;

import model.Host;

public class Mediator {
	private HashMap<String, Host> hosts;

	public Mediator() {
		hosts = new HashMap<>();
	}
	
	public void addHost(Host host) {
		hosts.put(host.getIpAddress(), host);
	}
	
	public void send(String senderIp, String receiverIp) {
		Host receiver = hosts.get(receiverIp);
		Host sender = hosts.get(senderIp);
		
		if(receiver == null || sender == null) {
			System.out.println("Invalid IP address");
			return;
		}
		
		receiver.receive(senderIp);
	}
}
