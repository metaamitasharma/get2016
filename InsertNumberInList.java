package DS5;


import java.util.LinkedList;
import java.util.Scanner;

/**
* DS Assignment 5
* problem 1
* class InsertNumberInList is to insert an element in sorted linkedList
*/

public class InsertNumberInList {

	Scanner sc = new Scanner(System.in);
	public static LinkedList<Integer> lnkList = new LinkedList<Integer>();
	int exit;

	/*
	* method to insert num in given sorted linkedList maintaining its ascending order
	*
	*/
	public void insertNumber(int num)

	{
		
		for (int i = 0; i < lnkList.size(); i++) {
			
			int temp = lnkList.get(i);
			if (temp > num) {
				
				lnkList.add(i, num);
				break;
			}
		}
		lnkList.add(num);
		System.out.println("Enter 0 to exit");
		exit = sc.nextInt();
		while (exit != 0) {
			insertNumber(getNumber());       //recursive call
		}
	}

	/*
	*method to get number from user 
	*returns number entered by user
	*/
	public int getNumber() {

		System.out.println("Enter number to be added");
		int n = sc.nextInt();
        return n;
	}
 /*
 *method to display Sorted list
 */
	public void DisplayList() {
		for (int i = 0; i < lnkList.size() - 2; i++) {
			System.out.println(lnkList.get(i));
		}
	}

	public static void main(String args[]) {
		InsertNumberInList obj = new InsertNumberInList();
		obj.lnkList.add(3);
		obj.insertNumber(4);
		obj.DisplayList();
	}

}
