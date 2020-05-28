package kolekcje;

import java.util.ArrayDeque;
import java.util.Queue;

public class Create_Queue {

	private Queue<Command> queue = new ArrayDeque<>();
	
	public Queue<Command> fillQueue() {
		Command com1 = new Command("XD1");
		Command com2 = new Command("XD2");
		Command com3 = new Command("XD3");
		Command com4 = new Command("XD4");
		
		queue.add(com1);
		queue.add(com2);
		queue.add(com3);
		queue.add(com4);
		
		return queue;
	}
}
