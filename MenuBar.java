package oopsAssignment4;

import java.util.ArrayList;

public class MenuBar {
	
	public Menu[] MenuList = new Menu[10];
	
	
	
	
	public void printMenuBar()
	{
		for(int i=0;i<MenuList.length;i++)
		{
			System.out.print(MenuList[i].MenuName+"\t");
		}
	}
	
	

}
