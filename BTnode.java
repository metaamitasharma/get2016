package DS3;
/**
 * 
 * class BTnode defines a node of binary tree
 * BTnode contains 3 parts as one key element ie value and other 2s for right and left child
 *
 */



public class BTnode<T> {

	
	public T value;
	BTnode Left;
	BTnode Right;
	
	public BTnode()
	{
		
	}
	
	public BTnode(T data)
	{
		value = data;
		Left = null;
		Right=null;
	}
}
