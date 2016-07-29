package DSsession1;

//Node class defines a node in singly linked list 

public class Node<T> {
	public T value;
	public Node next;



//default constructor	
public  Node()
{

	value =null;
	next=null;
}

//constructor with 1 parameter val sets val as value
public Node(T val)
{
	value = val;
	next = null;
}
} 
