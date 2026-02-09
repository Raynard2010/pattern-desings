package main;

import mediator.Mediator;
import model.Host;

public class Main {

	public Main() {
		Mediator mediator = new Mediator();
		
		Host host1 = new Host(mediator, "www.google.com", "Google");
		Host host2 = new Host(mediator, "www.facebook.com", "Facebook");
		Host host3 = new Host(mediator, "www.pinterest.com", "Pinterest");
		
		mediator.addHost(host1);
		mediator.addHost(host2);
		mediator.addHost(host3);

		host1.send("www.facebook.com");
		
		host3.receive("www.facebook.com");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
