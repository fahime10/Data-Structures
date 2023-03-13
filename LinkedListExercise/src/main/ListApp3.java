package main;

import lib.LinkedList2;
import lib.Node2;

public class ListApp3 {

	public static void main(String[] args) {
		Node2 n4 = new Node2(20, null);
		Node2 n3 = new Node2(400, n4);
		Node2 n2 = new Node2(570, n3);
		Node2 n1 = new Node2(80, n2);
		LinkedList2 list = new LinkedList2(n1);
		
		System.out.println(list.findMax(n1));
	}
}
