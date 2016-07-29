package DLinkedlist;

//Dnode class defines node in Doubly linked list
public class Dnode<T> {
	public T value;
	public Dnode<T> next;
	public Dnode<T> prev;

//default constructor	
public  Dnode()
{

	value =null;
	next=null;
	prev=null;
}

//constructor with one parameter val sets val as value 
public Dnode(T val)
{
	value = val;
	next = null;
	prev=null;
}

}//end of class
