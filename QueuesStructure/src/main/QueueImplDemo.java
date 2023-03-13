package main;

import Queues.QueueArrayImpl;

public class QueueImplDemo {

	public static void main(String[] args) {
		
		QueueArrayImpl q = new QueueArrayImpl();
		
		q.enqueue(1);
		q.display();
		
		q.enqueue(2);
		q.display();
		
		q.enqueue(3);;
		q.display();
		
		q.enqueue(4);
		q.display();
		
		q.enqueue(5);
		q.display();
		
		q.enqueue(6);
		q.display();

	}

}
