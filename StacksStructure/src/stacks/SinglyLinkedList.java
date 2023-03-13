package stacks;


public class SinglyLinkedList<E> {
	
	private Node<E> head;
	private int size = 0;
	public SinglyLinkedList() {
		
		head = null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public E first() {
		if(isEmpty()) return null;
		else return head.getItem();
	}
	
	public void addFirst(E e) {
		head = new Node<>(e, head);
		size++;
	}
	
	public E removeFirst() {
		if(isEmpty()) return null;
		E anItem = head.getItem();
		head= head.next(); size--;
		return anItem;
	}

}


