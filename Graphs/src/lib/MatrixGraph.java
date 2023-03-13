package lib;

public class MatrixGraph implements Graph {

	private int[][] matrix;
	private int vertices; // vertices are the values in the array
	
	
	
	public MatrixGraph(int n) {   
		vertices = n;
		matrix = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
	
	/** Adds an edge between the vertex start and the vertex end.
	 *
	 * @param start - The starting vertex of the edge.
	 * @param end - The end vertex of the edge.
	 */
	public void addEdge(int source, int target) {
		matrix[source-1][target-1] = 1;
	}
	
	
	/** Removes an edge between the vertex start and the vertex end.
	 *
	 * @param start - The starting vertex of the edge.
	 * @param end - The end vertex of the edge.
	 */
	public void removeEdge(int source, int target) {
		matrix[source-1][target-1] = 0;
	}
	
	
	/** Adds more vertices to the graph.
	 *
	 * @param newSize - the new number of vertices the graph should have
	 */
	public void addMoreVertices(int newSize) {
		if(newSize > vertices) {
			int oldVertices = vertices;
			vertices = newSize;
			int[][] newMatrix = new int[vertices][vertices];
			
			for(int i = 0; i < vertices; i++) {
				for(int j = 0; j < vertices; j++) {
					newMatrix[i][j] = 0;
				}
			}
					
			for(int i = 0; i < oldVertices; i++) {
				for(int j = 0; j < oldVertices; j++) {
					newMatrix[i][j] = matrix[i][j];
							
					matrix = newMatrix;
				}
			}
		}
	}
	
	
	/** Returns true if the given source and target pair are an edge
	 * in the graph; false otherwise.
	 *
	 * @param source
	 * @param target
	 * @return
	 */
	public boolean isEdge(int source, int target) {
		if(matrix[source-1][target-1] == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	// Rows are outgoing, columns are incoming
	/** Returns a list of the vertices that the given vertex points to
	 * (outgoing edges from the vertex).
	 *
	 * @param source - The vertex from which the outgoing edges start.
	 * @return
	 */
	public LinkedList getOutgoing(int source) { 
		LinkedList list = null;
		Node<Integer> prev = null;
		
		for(int col = 0; col < vertices; col++) {
			if(matrix[source - 1][col] == 1) {
				Node<Integer> n = new Node<Integer>(col, null);
				
				if(list == null) 
					list = new LinkedList<Integer>(n);
				 else 
					list.insertAfter(n, prev);
					prev = n;
			}
		}
		
		return list;
	}
	
	
	
	/** Returns a list of the vertices that have edges pointing to the
	 *  given vertex.
	 * (incoming edges to the vertex).
	 *
	 * @param target - The vertex at which the incoming edges end.
	 * @return
	 */
	public LinkedList getIncoming(int target)  {
		LinkedList list = null;
		Node<Integer> prev = null;
		
		for(int row = 0; row < vertices; row++) {
			if(matrix[row][target - 1] == 1) {
				Node<Integer> n = new Node<Integer>(row, null);
				
				if(list == null) 
					list = new LinkedList<Integer>(n);
				 else 
					list.insertAfter(n, prev);
					prev = n;
			}
		}
		
		return list;
		
	}
}
