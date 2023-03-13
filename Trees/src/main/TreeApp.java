package main;
import lib.BinaryTree;

public class TreeApp {

	public static void main(String[] args) {
		BinaryTree<Integer> b1 = new BinaryTree<>(5, null, null); // a leaf node.
		BinaryTree<Integer> b8 = new BinaryTree<>(30, null, null);
		BinaryTree<Integer> b2 = new BinaryTree<>(43, b1, b8); //the first value is the "root", so if left and right are null, it has no children, so it's a leaf node
		BinaryTree<Integer> b10 = new BinaryTree<>(9, null, null);
		BinaryTree<Integer> b9 = new BinaryTree<>(80, b10, null);
		BinaryTree<Integer> b3 = new BinaryTree<>(26, null, b9);
		BinaryTree<Integer> b4 = new BinaryTree<>(79, b3, b2); 
		BinaryTree<Integer> b5 = new BinaryTree<>(129, null, null);
		BinaryTree<Integer> b6 = new BinaryTree<>(47, null, b5);
		BinaryTree<Integer> b7 = new BinaryTree<>(220, b4, b6); // This is the root.
	
		printTree(b7);
		
		
		/*                    220
		                      /  \
		                    79   47
		                   / \     \
		                 26   43   129
		                  \   / \   /
		                  80 5  30 9
		                  
		*/
		
		
	/*int x = addAll(b3);
	System.out.println("\nUsing addAll gives " + x +"\n");
	
	
	int y = multiplyAll(b7);
	System.out.println("Using multiplyAll gives " + y + "\n");
		
	
	//doubleAll(b7);		
	//printTree(b7);
		
		
	boolean b = printPath(b7, 5);
	System.out.print(b);*/
	}
	
	/** This method prints a given tree.
	 * It calls printTree(BinaryTree<E> b, int depth).
	 * @param b - The tree to be printed.
	 * 
	 */
	public static void printTree(BinaryTree<Integer> b){
		printTree(b, 0);
	}
	
	/** This method prints a given tree recursively,
	 *  with each level indented using dashes.
	 * @param b - The tree to be printed.
	 * @param depth - The current depth.
	 */
	public static void printTree(BinaryTree<Integer> b, int depth){
		// this is a pre-order traversal
		/*if (b != null){
			String output = "";
			for (int i = 0; i < depth; i++){
				output = output + "";
			}
			output = output + b.getData();
			System.out.println(output);
			printTree(b.getLeft(), depth+2);  //it's printing the whole left subtree
			printTree(b.getRight(), depth+2);  // then it prints the right subtree
		}*/
		
		
		//this is post-order traversal
		/*if (b != null){
			String output = "";
			for (int i = 0; i < depth; i++){
				output = output + "";
			}
			output = output + b.getData();
			printTree(b.getLeft(), depth+2);  
			printTree(b.getRight(), depth+2);
			System.out.println(output);
		}*/
		
		
		//this is in-order traversal
		if (b != null){
			String output = "";
			for (int i = 0; i < depth; i++) {
				output = output + "";
			}
			output = output + b.getData();
			printTree(b.getLeft(), depth+1); 
			System.out.println(output);
			printTree(b.getRight(), depth+1);
		}
		
	}
	
	/** This method adds all the numbers in a given tree.
	 * Precondition: The tree must contain only integers.
	 * @param b - The tree.
	 * @return - The total sum of all the numbers.
	 */
	public static int addAll(BinaryTree<Integer> b){
		if (b != null){
			Integer num = b.getData();
			//System.out.println(num);
			num = num + addAll(b.getLeft()) + addAll(b.getRight());
			return num;
		}
		return 0;
	}
	
	/**
	 * This method multiplies all the numbers in a given tree.
	 * Precondition: The tree must contain only integers.
	 * @param b - The tree
	 * @return - The total multiplication of all integers.
	 */
	public static int multiplyAll(BinaryTree<Integer> b) {
		if(b != null) {
			Integer num = b.getData();
			num = num * multiplyAll(b.getLeft()) * multiplyAll(b.getRight());
			return num;
		}
		return 1;
	}

	
	/**
	 * This method doubles the current integers.
	 * @param b - The tree
	 */
	public static void doubleAll(BinaryTree<Integer> b) {
		if(b != null) {
			b.setData(b.getData() * 2);
			
			doubleAll(b.getLeft());
			doubleAll(b.getRight());
			
		}
	}
	
	
	public static boolean printPath(BinaryTree<Integer> b, Integer searchObj) {
		if(b != null) {
			if(b.getData().equals(searchObj)) {
				System.out.println(b.getData());
				return true;
			}
		
			boolean foundLeft = printPath(b.getLeft(), searchObj);
			
			if(foundLeft) {
				System.out.println(b.getData());
				return true;
				
			} else {
				
				boolean foundRight = printPath(b.getRight(), searchObj);
				
				if(foundRight) {
					System.out.println(b.getData());
					return true;
				}
				
				
			}
	}
		return false;
	
}
}