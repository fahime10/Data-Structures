package main;
import lib.Node;
import lib.LinkedList;

public class ListApp {

	public static void main(String[] args){
		Node n4 = new Node("green", null);   // this is a stack, you add on top
		Node n3 = new Node("orange", n4);
		Node n2 = new Node("blue", n3);
		Node n1 = new Node("red", n2);

		LinkedList list = new LinkedList(n1);  //LinkedList(Node h)

		/*System.out.println(list);
		System.out.println("n1 is " + n1.getItem());
		System.out.println("n2 is " + n2.getItem());
		System.out.println("n3 is " + n3.getItem());
		System.out.println("n4 is " + n4.getItem() + "\n");*/
		
		n3.setItem("yellow");

		Node newNode = new Node("purple", null);
		list.insertAfter(newNode, n2);   // so new node is inserted after n2, but it's not permanent
		
		
		System.out.println(list);  
		System.out.println("n1 is " + n1.getItem());
		System.out.println("n2 is " + n2.getItem());
		System.out.println("n3 is " + n3.getItem());
		System.out.println("n4 is " + n4.getItem());
		
		n4.setItem("grey");
		
		Node newItem = new Node("white", null);


		System.out.println(n3.next().getItem() + "\n");
		
		list.deleteAfter(n1);

		System.out.println("Using deleteAfter: " + list);  //after n1 is blue, so blue is gone.
		
		System.out.println("So n2 now is " + n2.getItem());  //blue is is still in n2, but not outputted.
		
		
		System.out.println("n2 is " + n2.next().getItem() + "\n"); // you need the next() to output purple.
		
		
		list.changeNextItem(n2, "lilac");
		System.out.println("n3 item is " + n3.getItem());
		System.out.println(list);
		list.changeNextItem(n4, "white");
		System.out.println(n4.getItem() + "\n\n");
		
		System.out.println(list);
		list.deleteAfter(n3);
		System.out.println(list + "\n\n");
		
		list.insertAfter(newItem, n3);
		System.out.println(list);
		list.replaceAfter(n2, n3);    //second parameter eliminates the next node
		System.out.println(list);
		System.out.println(n2.getItem() + "\n\n");
		
		//System.out.println(list);
		//list.swap(n1);
		System.out.println(list);
		list.changeAll("black");
		System.out.println(list);
	}
}
