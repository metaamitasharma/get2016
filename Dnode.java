package DLinkedlist;


public class Dnode<T> {
	public T value;
	public Dnode<T> next;
	public Dnode<T> prev;
	
public  Dnode()
{

	value =null;
	next=null;
	prev=null;
}


public Dnode(T val)
{
	value = val;
	next = null;
	prev=null;
}

}
