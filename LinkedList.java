package DSsession1;

public class LinkedList<T> {
	
	public Node start;
	//public Node current;
	
	public LinkedList()
	{
		start=null;
	}
	
	public void removefirstnode()
	{
		start = start.next;
		
	}

	public void addAtFront(T item)
	{
		
		Node<T> temp = new Node();
		temp.value = item;
		temp.next=start;
		start=temp;
	}
	public void additemAtLocation(int loc,T item)
	{
		
		Node< T> current = start;
		Node<T> temp = new Node();
		temp.value = item;
		for(int i=1;i<loc-1;i++)
		{
			if(current.next==null)
			{
				System.out.println("less elements in List");
			}
			current=current.next;
			
		}
		temp.next=current.next;
		current.next=temp;
	}
	
	public void RemoveByValue(T ItemValue)
	{
		Node< T> prev = start;
		Node<T> current = prev.next;
		while(current.next!=null)
		{
			if(current.value==ItemValue)
			{
				prev.next=current.next;
				return;
			}
			else
			{
				prev=prev.next;
				current=current.next;
			}
		}
		System.out.println("item not found in the list");
	}
	
	public void removeByIndex(int index)
	{
		Node< T> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		current.next=current.next.next;
	}
	
	public void RetriveByIndex(int index)
	{
		Node< T> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		System.out.println(current.value);
		
	}
	
	public void add(T item)
	{
		Node< T> current = start;
		Node<T> temp = new Node();
		temp.value= item;
		while(current.next!=null)
		{
			current = current.next;
		}
		temp.next=null;
		current.next=temp;
	}
	
	public  void display()
	{
		Node< T> current = start;
		
		while(current.next!=null)
		{
			
			System.out.print(current.value+"\t");	
			current = current.next;
		}
		System.out.println(current.value);	
	}
	
	
	public void reverseList()
	{
		 Node<T> prev   = null;
		    Node<T> current = start;
		    Node<T> Next;
		    while (current != null)
		    {
		        Next  = current.next;  
		        current.next = prev;   
		        prev = current;
		        current = Next;
		    }
		    start = prev;
	}
	
	
	public void sortList()
	{
		
	}
	
	
	
/*	public static void main(String args[])
	{
		LinkedList<String> Llist = new LinkedList<String>();
		Llist.addAtFront("start");
		Llist.add("a");
		Llist.add("b");
		Llist.add("c");
		Llist.add("d");
		Llist.add("e");
		Llist.display();
		System.out.println();
		Llist.additemAtLocation(2, "amita");
		Llist.display();
		System.out.println();
		Llist.removeByIndex(4);
		
		Llist.display();
		System.out.println();
		Llist.RemoveByValue("a");
		Llist.display();
		System.out.println();
		Llist.reverseList();
		Llist.display();
		
		
	}*/
	
	

}
