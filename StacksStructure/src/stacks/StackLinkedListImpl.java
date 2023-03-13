package stacks;

public class StackLinkedListImpl<E> implements Stack<E> {
	
	private SinglyLinkedList<E> list=new SinglyLinkedList<>();
	
	public void push(E e) throws Exception {list.addFirst(e);}
	
	public E pop() {return list.removeFirst();}
	
	public E peek() {return list.first();}
	
	public int size() {return list.size();}
	
	public boolean isEmpty() {return list.isEmpty();}
	
	public String toString() {return list.toString();}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		return null;
	}
}



