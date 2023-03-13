package stacks;

	public interface Stack<E>
	{
		void push(E e) throws Exception;
		E pop();
		E top();
		int size();
		boolean isEmpty();
	}
