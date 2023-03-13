package Queues;

public class QueueArrayImpl implements Queue {

	int SIZE = 5;
	int items[] = new int[SIZE];
	int front, rear;
	
	public QueueArrayImpl() {
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		if(front == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(front == 0 && rear ==  SIZE - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
			if(front == -1) {
				front = 0;
				rear++;
				items[rear] = element;
				System.out.println("Inserted: " + element);
			} else {
				rear++;
				items[rear] = element;
				System.out.println("Inserted: " + element);
			}
		}
		}
	
	public int dequeue() {
		int element;
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			element = items[front];
			if(front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			System.out.println("Deleted -> " + element);
			return element;
		}
	}
	
	public void display() {
		int i;
		
		if(isEmpty()) {
			System.out.println("Empty queue");
		} else {
			System.out.println("\nFront index -> " + front);
			System.out.println("Items -> ");
			for(i = front; i <= rear; i++) {
				System.out.print(items[i] + " ");
			}
			System.out.println("\nRear index -> " + rear + "\n");
		}
	}

	public int size() {
		return SIZE;
	}

	public int first() {
		return front;
	}

	public int last() {
		return rear;
	}
}
