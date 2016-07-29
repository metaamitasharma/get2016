package DSsession1;

//LinkedList is generic class defines methods for singly liked list implementation

public class LinkedList<T> {
	
	public Node start;

	//default constructor
	public LinkedList()
	{
		start=null;
	}
         
         //adds a new node containing item in its value section at the front of linked list
	public void addAtFront(T item)
	{
		
		Node<T> temp = new Node();
		temp.value = item;
		temp.next=null;
		start=temp;
	}
	
	//adds a new node in list with item in its value section at given location
	public void additemAtLocation(int loc,T item)
	{
		
		Node< T> current = start;   //to travrse the list
		Node<T> temp = new Node();  //new node that is going to be added at loc
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
	
	
	//removes a node having value = itemvalue from the list 
	public void RemoveByValue(T ItemValue)
	{
		Node< T> prev = start;     //stores previous node position 
		Node<T> current = prev.next;   //traverses list
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
	
	//a node at from given index is removed
	public void removeByIndex(int index)
	{
		Node< T> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		current.next=current.next.next;
	}
	
	//returns value of node at given index
	public void RetriveByIndex(int index)
	{
		Node< T> current = start;
		for(int i =1;i<index-1;i++)
		{
			current=current.next;
		}
		System.out.println(current.value);
		
	}
	
	//to add a new node with value=item 
	//node is being added at the end of list 
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
	 
	 //to display node elements in the list
	public  void display()
	{
		Node< T> current = start;
		
		while(current.next!=null)
		{
			
			System.out.println(current.value);	
			current = current.next;
		}
		System.out.println(current.value);
			System.out.println();
	}
	
	//reversing the list
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
	
	
	
	public static void main(String args[])
	{
		LinkedList<String> Llist = new LinkedList<String>();
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
		Llist.display();
		
	}
	
	

}
