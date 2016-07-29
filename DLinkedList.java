package DLinkedlist;

//class DLinkedList defines operations to implement doubly lunked list
public class DLinkedList<T> {
	
	public Dnode start;   //first node pointer
	public Dnode end;     //end node pointer
	
	
	//default constructor
	public DLinkedList()
	{
		start=null;
		end = null;
	}

       //adds a node with item = value at front 
	public void addAtFront(T item)
	{
		
		Dnode<T> temp = new Dnode();
		temp.value = item;
		temp.next=null;
		temp.prev=null;
		start=temp;
		end=temp;
	}
	
	//adds a new node at given location
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
	
	//removes a node having value= itemvalue
	public void RemoveByValue(T ItemValue)
	{
		Dnode< T> pre = start;                //stores node previous to the current node 
		                                      //to find node previous to the node that is being removed
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
	
	
	 //removes a node from given index 
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
	
	//provides value at given index
	public void RetriveByIndex(int index)
	{
		Dnode< T> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		System.out.println(current.value);
		
	}
	
	//to add new node 
	//new node is being added at end
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
	
	//to display doubly linked list
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
	
	//reversing the list
	public void reverseList()
	{
		Dnode<T> current = end;
		System.out.println(current.value);
		while(current.prev!=null)
		{
			current=current.prev;
			System.out.println(current.value);
		
		}
	     	System.out.println();	
	  
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
	Llist.additemAtLocation(2, "amita");
	Llist.display();
	Llist.removeByIndex(4);
        Llist.display();
	Llist.RemoveByValue("a");
	Llist.display();
	Llist.reverseList();
	
	
	}	
	

}
