package DLinkedlist;

public class DLinkedList<T> {
	
	public Dnode start;
	public Dnode end;
	//public Node current;
	
	public DLinkedList()
	{
		start=null;
		end = null;
	}

	public void addAtFront(T item)
	{
		
		Dnode<T> temp = new Dnode();
		temp.value = item;
		temp.next=null;
		temp.prev=null;
		start=temp;
		end=temp;
	}
	public void additemAtLocation(int loc,T item)
	{
		
		Dnode< T> current = start;
		Dnode<T> temp = new Dnode();
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
		current.next.prev=temp;
		temp.prev=current;
		current.next=temp;
	
		
	}
	
	public void RemoveByValue(T ItemValue)
	{
		Dnode< T> pre = start;
		Dnode<T> current = pre.next;
		while(current.next!=null)
		{
			if(current.value==ItemValue)
			{
				pre.next=current.next;
				current.next.prev=current.prev;
				return;
			}
			else
			{
				pre=pre.next;
				current=current.next;
			}
		}
		System.out.println("item not found in the list");
	}
	
	public void removeByIndex(int index)
	{
		Dnode< T> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		current.next=current.next.next;
		current.next.prev=current;
	}
	
	public void RetriveByIndex(int index)
	{
		Dnode< T> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		System.out.println(current.value);
		
	}
	
	public void add(T item)
	{
		Dnode< T> current = start;
		Dnode<T> temp = new Dnode();
		temp.value= item;
		while(current.next!=null)
		{
			current = current.next;
		}
		temp.prev=current;
		temp.next=null;
		current.next=temp;
		end=temp;
	}
	
	public  void display()
	{
		Dnode< T> current = start;
		
		while(current.next!=null)
		{
			
			System.out.println(current.value);	
			current = current.next;
		}
		System.out.println(current.value);	
	}
	
	
	public void reverseList()
	{
		Dnode<T> current = end;
		System.out.println(current.value);
		while(current.prev!=null)
		{
			current=current.prev;
			System.out.println(current.value);
			//current=current.prev;
		}
	  
	}
	
	
	
	
	public void sortList()
	{
		
	}
	
	public static void main(String args[])
	{
	DLinkedList<String> Llist = new DLinkedList<String>();
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
	
	
	}	
	

}
