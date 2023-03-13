package Queues;

public interface Queue {

	int size();
	
	boolean isEmpty();
	
	boolean isFull();
	
	void enqueue(int e);
	
	int dequeue();
	
	int first();
	
	int last();
}
