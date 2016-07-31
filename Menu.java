package oopsAssignment4;

import java.util.ArrayList;

public class Menu extends MenuBar{
 
	public String MenuName;
	MenuItem[] menuItems = new MenuItem[10];	
	public Menu()
	{
		
	}
	public Menu(String name)
	{
		MenuName=name;
		
	}
	
	public String getMenuName() {
		return MenuName;
	}
	public void setMenuName(String menuName) {
		MenuName = menuName;
	}
	public void printMenu(String name)
	{
		if(MenuName.equalsIgnoreCase(name))
		{
		for(int i=0;i<menuItems.length;i++)
		{
			System.out.print(menuItems[i].MenuName+"\t");
		}
		}
	}

}
