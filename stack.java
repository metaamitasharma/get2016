package DSsession1;

/**
 * 
 *Generic class stack<T> implements stack through linked list
 *
 * 
 */

public class stack<T> {
	
	public LinkedList<T> stacklist;
	 public Node top;                    //top node of stack
	
public stack()
{
	stacklist = new LinkedList();
	top = stacklist.start;              //top node points to start node of the LinkedList
}

/*
 * push operation
 * an item is added at top always in the stack
 */
public void push(T data)
{
	stacklist.addAtFront(data);
	top = stacklist.start;
}

/*
 * pop operation 
 * deletion is also performed from top of the stack
 */
public Object pop()
{
  if(top==null)                      //overflow condition for stack
{
	System.out.println("stack underflow:");
	return -1;
}
  else
  {   
	  Object item = stacklist.start.value;
	  stacklist.removefirstnode();
	  return item;
  }
}


}
