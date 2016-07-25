package MENU;

import java.util.Scanner;

//class Menu contains main fuction

public class Menu extends EditMenu {
		   	
	private static int Ifcontinue = -1;

	public static void main(String args[])
	{  
		
		EditMenu edit = new EditMenu();      //object to EditMenu Class
		edit.goToEditMenu();		        //method shows edit menu and its submenues
		edit.ShowMenuItems();              //method shows items in submenu
		edit.getMenuItem();                //takes user choice among items
		new Actions(). ActionPerform(edit); //action corresponding to choice is performed
	    
	   
	}

}
