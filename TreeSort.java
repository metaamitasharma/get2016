package DS_assignment_8;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * problem 1 main
 * treeSort class sorts an array using tree-sort algorithm
 * first we create BST and traverse in INORDER to get e
 *
 */

public class TreeSort {

	public BTnode Root; // root node of binary tree
	ArrayList<Integer> traverseList;

	// constructor
	public TreeSort() {
		Root = null;
	}

	/*
	 * method to create BST sets element item in BST
	 */
	public BTnode createBT(BTnode pivot, int item) {

		if (pivot == null) {
			pivot = new BTnode(item);
			return pivot;
		}
		// if item value is less than pivot value than move to left child of
		// pivot
		else if ((Integer) pivot.value > item) {

			pivot.Left = createBT(pivot.Left, item); // recursive call
		}
		// if item value is greater than pivot value than move to right child
			// of pivot
		else {

			pivot.Right = createBT(pivot.Right, item); // recursive call
		}
		return pivot;

	}

	/*
	 * method for in-order traversal 
	 */
	public void Inorder(BTnode root) {

		if (root != null) {
			Inorder(root.Left);
			System.out.println(root.value);
			Inorder(root.Right);
		}

	}

	public static void main(String args[])

	{
		Scanner input = new Scanner(System.in);
		TreeSort Btree = new TreeSort();
		System.out.println("how many elements in tree ");
		int size = input.nextInt();
		int[] array = new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
			// binaryTree.createBT(binaryTree.Root, array[i]);
		}
		BTnode temp = new BTnode(array[0]);
		Btree.Root = temp;
		for (int i = 1; i < array.length; i++) {
			Btree.createBT(Btree.Root, array[i]);

		}
		System.out.println("ascending order :");
		Btree.Inorder(Btree.Root);
	}
}
