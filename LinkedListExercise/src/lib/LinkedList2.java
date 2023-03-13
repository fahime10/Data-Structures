package lib;

public class LinkedList2 {

	private Node2 head;

	public LinkedList2(Node2 h){
		head = h;
	}
	
	
	public Node2 getHead(){
		return head;
	}
	
	
	public void setHead(Node2 n){
		head = n;
	}
	
	
	public void insertAfter(Node newNode, Node prev){
		newNode.setNext(prev.next());
		prev.setNext(newNode);
	}
	
	
	
	public void deleteAfter(Node prev){
		prev.setNext(prev.next().next());
	}
	

	public String toString(){
		String str = "";
		Node2 current = head;
		while(current != null){
			str = str + current.getValue();
			current = current.next();
			if (current != null){
				str = str + ", ";
			}
		}
		return str;
	}
	
	
	public int findMax(Node2 n) {
		if(n == null) {
			return 0;
		}
		return Math.max(n.getValue(), findMax(n.next()));
	}

}
