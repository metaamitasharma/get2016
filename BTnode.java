package DS_assignment_8;

/*
 * problem 1 
 */

public class BTnode<T> {
	public T value;
	BTnode Left;
	BTnode Right;
	
	public BTnode()
	{
		
	}
	 //constructor
	public BTnode(T data)
	{
		value = data;
		Left = null;
		Right=null;
	}

}
