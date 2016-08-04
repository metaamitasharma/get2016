package DSassignment_5;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
 /**
  * 
  * DS assignment 5 
  * problem 2
  * class Queue2 is to implement Queue using LinkedList
  */
public class Queue2 {
	
	Scanner sc=new Scanner(System.in);
	public LinkedList<Integer> queue = new LinkedList<Integer>();
	boolean OF = false;             //for checking Queue overflow condition
	int exit=0;
	int maxlength = 100;            //maximum length of queue
	
	
	/*
	 * Enqueue operation to insert an element in queue
	 */
	public void Enqueue(int item)
	{
		
		if(!OF)
		{
		queue.add(item);      //adding element at end of list
		maxlength --;
		}
		else
		{
			System.out.println("Queue Overflow: can't insert ");
		}
		if(maxlength==0)
		{
			OF = true;
		}
	}
	
	/*
	 * dequeue operation to remove element from queue
	 * as element is removed from front here first node is removed in linked list
	 */
	public void  Dequeue()
	{
		if(queue.size()==0)
		{
			System.out.println("no element in Queue");
			System.out.println("enter 1 to continue with Queue");
			exit = sc.nextInt();
			
		}
		else
		{
			queue.removeFirst();
		}
		
	}
	 /*
	  * displaying queue using Iterator
	  */
	public void display()
	{
		ListIterator itr = queue.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void main(String args[])
			{
			Queue2 obj = new Queue2();
			obj.Enqueue(5);
			obj.Enqueue(12);
			obj.Enqueue(2);
			obj.Enqueue(8);
			obj.display();
			obj.Dequeue();
			obj.Dequeue();
			obj.Enqueue(9);
			obj.display();
			
			}
}
