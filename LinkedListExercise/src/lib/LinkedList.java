package lib;

public class LinkedList {
	private Node head;

	public LinkedList(Node h){
		head = h;
	}
	
	
	public Node getHead(){
		return head;
	}
	
	
	public void setHead(Node n){
		head = n;
	}
	
	
	public void insertAfter(Node newNode, Node prev){
		newNode.setNext(prev.next());
		prev.setNext(newNode);
	}
	
	
	
	public void insertBefore(Node newNode, Node after) {
		
		if(after != null && newNode != null) {
			if(after == head) {
				newNode.setNext(head);
				head = newNode;
			} else {
		Node current = head;
		Node prev = null;
		
		while (current != after && current != null) {
			prev = current;
			current = current.next();
		}
		
		if(current != null) {	
		newNode.setNext(after);   //this creates the new reference to the next node
		prev.setNext(newNode);   // the value becomes prev
		}
	}
 }
	}
	
	
	public void deleteAfter(Node prev){
		prev.setNext(prev.next().next());
	}
	

	public String toString(){
		String str = "";
		Node current = head;
		while(current != null){
			str = str + current.getItem();
			current = current.next();
			if (current != null){
				str = str + ", ";
			}
		}
		return str;
	}
	
	
	public void changeNextItem(Node n, String str) {
		/*try {
		n.next().setItem(str);
	} catch (Exception e) {
	System.out.println("Cannot execute");
	};*/
		
		if(n.next() != null) {
			n.next().setItem(str);
		}
	}
	
	public void replaceAfter(Node newNode, Node prev) {
		newNode.setNext(prev.next().next());
		prev.setNext(newNode);
	}
	
	public void swap(Node n) {
		Node first= n.next();
		Node second = first.next();
		
		first.setNext(second.next());
		second.setNext(first);
		n.setNext(second);
	}
	
	public void changeAll(String colour) {
		Node current = head;
		
		while(current != null) {
			current.setItem(colour);
			current = current.next();
		}
	}
	
	
	public void changeBeforeNode(Node after, String str) {
		if(after != null && after != head) {
			Node current = head;
			Node prev = null;
			
			while(current != after) {
				prev = current;
				current = current.next();
			}
			
			if(current != null) {
				prev.setItem(str);
			}
		}
	}
	
	
	public void deleteHead() {
		head = head.next();
	}
	
	
	public void uppercase(Node n) {
		if(n != null) {
		n.setItem(n.getItem().toUpperCase());
		uppercase(n.next());
		}
	}
}
