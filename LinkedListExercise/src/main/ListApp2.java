package main;

import lib.LinkedList;
import lib.Node;

public class ListApp2 {

	public static void main(String[] args){
		Node n5 = new Node("grey", null);
		Node n4 = new Node("green", null); 
		Node n3 = new Node("orange", n4);
		Node n2 = new Node("blue", n3);
		Node n1 = new Node("red", n2);

		LinkedList list = new LinkedList(n1);
		
		System.out.println(list+"\n");
		
		Node purple = new Node("purple", null);  // visualise as a pack, node(purple,null)
		list.insertBefore(purple, n2);           // so purple is inserted before n2
		System.out.println("Using insertBefore: " + list + "\n");
		
		list.insertBefore(purple, n3);
		System.out.println(list + "\n");
		
		Node white = new Node("white", null);
		list.insertBefore(white, n5);
		System.out.println(list + "\n");
		
		
		list.insertBefore(white, n1);
		System.out.println(list + "\n");
		
		list.changeBeforeNode(n4, "black");
		System.out.println("Using changeBeforeNode: " + list + "\n");
		
		
		list.deleteHead();
		System.out.println("Using deleteHead: " + list + "\n");
		
		list.uppercase(n1);
		System.out.println("Using uppercase: " + list);
		
		
	}
}
