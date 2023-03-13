package main;

import lib.Module;
import lib.ModuleTree;

public class ModuleTreeDemo {

	public static void main(String[] args) {
		Module m = new Module("Physics", 2014, 1, "Dr. Cole");
		
		ModuleTree mt = new ModuleTree(m);
		
		Module data = (Module) mt.getData();
		
		System.out.println("The lecturer for " + data.getName() + " is " + data.getLecturer());
		
		
		Module ood = new Module("Object Oriented Design", 2019, 1, "Luke");
		
		System.out.println(ood);
		
		//-----------------------------------------
		// Using Module ood here too.
		ModuleTree<Module> start = new ModuleTree<>(ood); // root tree
		
		Module oodev = new Module("Object Oriented Development", 2020, 2, "Luke");
		ModuleTree<Module> advTree = new ModuleTree<>(oodev);  // child of the root
		
		start.addModuleAfter(advTree); 
		
		/*
		 * 		start
		 *     /
		 *    /
		 *  advTree
		 *    
		 */
		
		ModuleTree<Module> leftChild = (ModuleTree<Module>) start.getLeft();
		
		Module leftCModule = leftChild.getData();
		
		System.out.println(leftCModule.getName());
		
		
	}
}
