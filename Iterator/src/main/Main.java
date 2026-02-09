package main;

import java.util.ArrayList;

import iterator.FIFOIterator;
import iterator.Iterator;
import iterator.LIFOIterator;
import model.User;

public class Main {
	
	public Main() {
		ArrayList<User> list1 = new ArrayList<>();
		list1.add(new User("Andi", 20));
		list1.add(new User("Budi", 67));
		list1.add(new User("Freddy", 87));

		User[] list2 = new User[10];
		int size = 0; // index dan hitung size
		list2[size++] = new User("Andi", 20);
		list2[size++] = new User("Budi", 67);
		list2[size++] = new User("Freddy", 87);

		Iterator<User> fifo = new FIFOIterator<User>(list1);
		Iterator<User> lifo = new LIFOIterator<User>(list2, size);
		
		while(fifo.hasNext()) {
			System.out.println(fifo.getNext().getUsername());
		}
		
		System.out.println("");
		
		while(lifo.hasNext()) {
			System.out.println(lifo.getNext().getUsername());
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
