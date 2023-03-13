package main;

import lib.MatrixGraph;
import lib.LinkedList;

public class GraphApp {

	public static void main(String[] args){

		MatrixGraph graph = new MatrixGraph(4);
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(2, 3);
		graph.addEdge(1, 4);
		System.out.println(graph.isEdge(1,2));
		
		LinkedList list = graph.getIncoming(4);
		System.out.println(list);
		list = graph.getOutgoing(2);
		System.out.println(list); 
	}
}
