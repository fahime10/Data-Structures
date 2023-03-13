package lib;

public interface Graph {
	/** Adds an edge between the vertex start and the vertex end.
	 *
	 * @param start - The starting vertex of the edge.
	 * @param end - The end vertex of the edge.
	 */
	public void addEdge(int source, int target);

	/** Removes an edge between the vertex start and the vertex end.
	 *
	 * @param start - The starting vertex of the edge.
	 * @param end - The end vertex of the edge.
	 */
	public void removeEdge(int source, int target);

	/** Adds more vertices to the graph.
	 *
	 * @param newSize - the new number of vertices the graph should have
	 */
	public void addMoreVertices(int newSize);

	/** Returns a list of the vertices that the given vertex points to
	 * (outgoing edges from the vertex).
	 *
	 * @param source - The vertex from which the outgoing edges start.
	 * @return
	 */
	public LinkedList<Integer> getOutgoing(int source);

	/** Returns true if the given source and target pair are an edge
	 * in the graph; false otherwise.
	 *
	 * @param source
	 * @param target
	 * @return
	 */
	public boolean isEdge(int source, int target);

	/** Returns a list of the vertices that have edges pointing to the
	 *  given vertex.
	 * (incoming edges to the vertex).
	 *
	 * @param target - The vertex at which the incoming edges end.
	 * @return
	 */
	public LinkedList<Integer> getIncoming(int target);
}