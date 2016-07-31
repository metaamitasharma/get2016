package oopsAssignment4;

public class MenuItem extends Menu{
	
	
	public MenuItem(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String ItemName;
	
	public void performAction()
	{
		System.out.println("Action "+ItemName+"has been performed");
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	
	
}
