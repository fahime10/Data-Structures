package lib;

public class Node2 {

	private int value;
	private Node2 nextItem;
	
	
	public Node2(int v, Node2 n){
		value = v;
		nextItem = n;
	}


	public int getValue() {
		return value;
	}


	public Node2 next() {
		return nextItem;
	}
	
	public void setValue(int n) {
		value = n;
	}
}
