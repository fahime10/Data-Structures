package stacks;

public class StackArrayImpl<E> implements Stack<E> {
	
	private E[] item;
	private int top=-1;
	
	public static final int MAX_SIZE=20;
	
	public StackArrayImpl() {
		item=(E[]) new Object[MAX_SIZE];
	}
	
	
	public StackArrayImpl(int capacity) {
		item=(E[]) new Object[capacity];
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public E peek() {
		if(isEmpty()) 
		return null;	
		return item[top];
	}
	
	@Override
	public void push(E e) throws Exception {
		if(size()==item.length) throw new Exception("Stack full");
		else { 
		top++;
		item[top]=e;
		}
	}
	
	@Override
	public E pop() {
		
		if(isEmpty()) return null;
		
		E anItem=item[top]; 	item[top]=null;
		top--;
		return anItem;
	}
	
	@Override
	public E top() {
		return null;
	}

}


