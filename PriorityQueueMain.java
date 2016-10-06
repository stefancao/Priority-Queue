/**
 * First Name: Stefan
 * Last Name: Cao
 *
 * Filename : PriorityQueueMain.java
 */ 

public class PriorityQueueMain {

	public static void main(String[] args) {
		
		System.out.println("Item:Key");
		
		PriorityQueue pq = new PriorityQueue();
		pq.addInteger(2, 4);
		pq.addInteger(1, 3);
		pq.addInteger(5, 8);
		pq.addInteger(3, 2);
		pq.addInteger(4, 7);
		pq.addInteger(5, 5);
		pq.display();
		System.out.println("\n");
		pq.addInteger(4, 2);
		pq.addInteger(1, 1);
		pq.pollInteger();
		pq.pollInteger();
		pq.pollInteger();
		pq.pollInteger();
		pq.pollInteger();
		pq.display();
		System.out.println("\n");
		
		PriorityQueue pq2 = new PriorityQueue();
		pq2.addInteger(7, 8);
		pq2.addInteger(6, 7);
		pq2.addInteger(5, 7);
		pq2.addInteger(4, 7);
		pq2.addInteger(3, 3);
		pq2.addInteger(2, 3);
		pq2.addInteger(1, 3);
		pq2.display();
			
		
	}

}
