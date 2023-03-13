package lib;

public class ModuleTree<E> extends BinaryTree<E> {

	//inherited from generic type
	public ModuleTree(E e) {
		super(e, null, null); // value node, left child, right child
	}
	
	public void addModuleAfter(ModuleTree mt) {
		if(this.getLeft() == null) {
			this.setLeft(mt);
		} else if (this.getRight() == null) {
			this.setRight(mt);
		} else {
			 System.out.println("No more children can be added");
		}
	}
	
	
	//print leaf nodes basically
	public void printEndModules(ModuleTree<E> mt) {
		if(mt == null) {
			return;
		} 
		
		if(mt.getLeft() == null && mt.getRight() == null) {
			System.out.println(mt.getData() + " ");
		} else {
			printEndModules((ModuleTree<E>) mt.getLeft());
			printEndModules((ModuleTree<E>) mt.getRight());
		}
	}
	
	
	public E getChildModule(int i) {
		if(i == 1) {
			if(this.getLeft() != null)
			return getLeft().getData();
		} else if(i == 2) {
			if(this.getRight() != null) {
			return getRight().getData();
		}
		}
		return null;
	}
}
