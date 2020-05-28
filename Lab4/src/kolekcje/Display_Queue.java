package kolekcje;

import java.util.Queue;

public class Display_Queue {

	Create_Queue crq = new Create_Queue();
		
	public void displayQueue() {
		Queue<Command> que = crq.fillQueue();
		
		for(Command com: que) {
			System.out.println(com.operation());
		}
	}
	
	public static void main(String[] args) {
		Display_Queue disQue = new Display_Queue();
		disQue.displayQueue();
	}
}
