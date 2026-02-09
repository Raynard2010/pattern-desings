package model;

import mediator.Mediator;

public class Host {
	private Mediator mediator;
	private String ipAddress;
	private String hostName;
	public Host(Mediator mediator, String ipAddress, String hostName) {
		super();
		this.mediator = mediator;
		this.ipAddress = ipAddress;
		this.hostName = hostName;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public void send(String receiverIp) {
		System.out.println("Sending message from " + hostName + " to " + receiverIp);
		mediator.send(ipAddress, receiverIp);
	}
	
	public void receive(String senderIp) {
		System.out.println(hostName + " received message from " + senderIp);
	}
}
