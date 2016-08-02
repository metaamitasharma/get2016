package DS3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * class BinaryTree has methods to create and traverse binary trees
 *
 */
public class BinaryTree {
	public BTnode Root;            //root node of binary tree
	ArrayList<Integer> traverseList;

	
	//constructor
	public BinaryTree() {
		Root = null;
		traverseList = new ArrayList<Integer>();   //list to traverse binary tree
	}
 
	/*
	 * method to create BST 
	 * sets element item in BST
	 */
	public BTnode createBT(BTnode pivot, int item) {

		if (pivot == null) {
			pivot = new BTnode(item);
			return pivot;
		}
		//if item value is less than pivot value than move to left child of pivot
		else if ((Integer) pivot.value > item) {

			pivot.Left = createBT(pivot.Left, item);   //recursive call
		}  //if item value is greater than pivot value than move to right child of pivot
		else         
		{

			pivot.Right = createBT(pivot.Right, item);    //recursive call
		}
		return pivot;

	}
	/*
	*      problem 1
	*method to traverse Binary tree in preorder i.e root->left->right
	*
		public void preOrder(BTnode root) {

		if (root != null) {
			System.out.print(root.value + "\t");
			preOrder(root.Left);
			preOrder(root.Right);
		
			  	}

	}

	/*
	 * method for inorder traversal
	 * adds traversed values to traverse list so that i can compare for mirror similar
	 */
	public void Inorder(BTnode root) {

		if (root != null) {
			Inorder(root.Left);
			// System.out.println(root.value);
			try {
				traverseList.add((Integer) root.value);
			} catch (Exception e) {

			}
			Inorder(root.Right);
		}

	}
	
        //PROBLEM 3
	//method for post order traverse
	
	public void postOrder(BTnode root) {

		if (root != null) {
			postOrder(root.Left);
			postOrder(root.Right);
			System.out.print(root.value + "\t");
			  

		}

	}
 /*
  * this is method to traverse a tree in reverse in- order 
  * i.e right->root->left
  */
	public InorderReverse(BTnode root) {
	
		if (root != null) {
			InorderReverse(root.Right);
			traverseList.add((Integer) root.value);   //adding traversed values to traverse list 
			InorderReverse(root.Left);                      //to compare with in-order traversal
		}
	
	}

	/* PROBLEM 2
	 * method to check two trees are mirror-similar or not
	 * I'm checking this by traversing one tree in INORDER and other one in REVERSE-INORDER
	 * if the results of these two traversing is similar then these two are mirror similar
	 */
	public boolean checkMirrorTrees(BinaryTree BT) {


		if (this.traverseList.size() == BT.traverseList.size())
		{
			for (int i = 0; i < BT.traverseList.size(); i++)
			{
				if (this.traverseList.get(i) != BT.traverseList.get(i))
				{
					return false;
				}
			}
			return true;          //if traverseLists of both are same returns true
		}

		else {
			return false;

		}
	}
	
	
	
	public static void main(String args[]) 
	
	{
		Scanner input = new Scanner(System.in);
		BinaryTree binaryTree = new BinaryTree();
		BinaryTree binaryTree1 = new BinaryTree();
		System.out.println("how many elements in tree 1 ");
		int size1 = input.nextInt();
		int[] array1 = new int[size1];
		System.out.println("enter elements");
		for (int i = 0; i < size1; i++) {
			array1[i] = input.nextInt();
		}
		BTnode temp = new BTnode(array1[0]);
		binaryTree.Root = temp;
		for (int i = 1; i < array1.length; i++) {
			binaryTree.createBT(binaryTree.Root, array1[i]);

		}
		binaryTree.Inorder(binaryTree.Root);

		for (int i = 0; i < binaryTree.traverseList.size(); i++) {
			System.out.print(binaryTree.traverseList.get(i) + "\t");
		}

		System.out.println("how many elements in tree 2 ");
		int size2 = input.nextInt();
		int[] array2 = new int[size2];
		System.out.println("enter elements");
		for (int i = 0; i < size2; i++) {

			array2[i] = input.nextInt();
		}

		BTnode temp2 = new BTnode(array2[0]);
		binaryTree1.Root = temp2;
		for (int i = 1; i < array2.length; i++) {

			binaryTree1.createBT(binaryTree1.Root, array2[i]);
		}

	binaryTree1.InorderReverse(binaryTree1.Root);

		if (binaryTree.checkMirrorTrees(binaryTree1)) {
			System.out.println("trees are mirror similar");
		} else {
			System.out.println("trees are not mirror similar");

		}
		System.out.println("postorder traversal :");
		binaryTree.postOrder(binaryTree.Root);
		System.out.println("preorder traversal :");
		binaryTree.preOrder(binaryTree.Root);
	}


}
