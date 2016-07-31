package oopsAssignment4;

import java.util.Scanner;
import java.io.IOException;

public class MainMenu{
	
	MenuBar menubar = new MenuBar();
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		MainMenu mainmenu = new MainMenu();
		mainmenu .makeMenuBar();
		mainmenu.menubar.printMenuBar();
		System.out.println("select a menu above");
		String selectedMenu = input.next();
		for(int i=0;i<mainmenu.menubar.MenuList.length;i++)
		{
			mainmenu.menubar.MenuList[i].printMenu(selectedMenu);
		}
		System.out.println("select a menuItem above");
		String userItemChoice = input.next();
		MenuItem userItem = new MenuItem(userItemChoice);
		userItem.performAction();
		 
		
	}
	
	public void makeMenuBar()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter no of menus on menubar");
		int totalMenus = input.nextInt();
		for(int i =0;i<totalMenus;i++)
		{
			System.out.println("enter menu name");
			String menuname = input.next();
			menubar.MenuList[i] = new Menu(menuname);
			System.out.println("enter Y or y if this is a composite menu");
			String isComposite = input.next();
			
			if(isComposite.equalsIgnoreCase("y"))
			{
				makeSubMenu(menubar.MenuList[i]);
			}
			else
			{
				setMenuItems(menubar.MenuList[i]);
			}
			
		}
	}

	public void makeSubMenu(Menu menu)
	{
		Menu submenu = new Menu();
		Scanner input = new Scanner(System.in);
		System.out.println("enter no of submenus");
		int totalSubMenus = input.nextInt();
		for(int i=0;i<totalSubMenus;i++)
		{
			System.out.println("enter"+ (i+1)+"th menu");
			submenu.MenuName=input.next();
			System.out.println("enter Y or y if this is a composite menu");
			String isComposite = input.next();
			if(isComposite.equalsIgnoreCase("y"))
			{
				makeSubMenu(submenu);
			}
			else
			{
				setMenuItems(submenu);
			}
			
		}
	}
	
	public void setMenuItems(Menu menu)
	{
		try{
		Scanner input = new Scanner(System.in);
		System.out.println("enter no of menu items");
		int totalItems = input.nextInt();
		for(int j=0;j<totalItems;j++)
		{
			
			System.out.println("enter "+ (j+1)+"th item name");
			String str = input.next();
			menu.menuItems[j].ItemName =str;
		}
			
		
	}
	catch(Exception ex)
	{
		System.out.println("Something went wrong: "+ex.getMessage());
	}
}
}
