package MENU;

import java.util.Scanner;

//class EditMenu deals with sub-menu and menu items in edit menu

public class EditMenu {
	
	 public String Choice;      //edit menu having choice ie. sub-menu
	                            // 1)fontSize 2)FontStyle 3)fontColor
     public   int FontSize;
     public  String FontStyle;
	 public String color;
	 
	 //displays edit menu
	 public void goToEditMenu()
	 {
		 System.out.println("What u want to edit : \n 1)Font Size\tFont Style\t3)Color");
		 Scanner input = new Scanner(System.in);
		 Choice = input.next();
	 }
    
	 
	 //displays items in sub-menus 1)fontSize 2)FontStyle 3)fontColor
	public void ShowMenuItems()
	
	{
		if(Choice.equalsIgnoreCase("FontSize"))
		{
	    int[] fontSizesAvailable = {12,16,18,20,24};
		
		for(int i=0;i<fontSizesAvailable.length;i++)
		System.out.print( fontSizesAvailable[i]+"\t");	
		}
		else if(Choice.equalsIgnoreCase("FontStyle"))
		{
			String[] fontStylesAvailable = {"Arial ","Arial MT ","Boulder ","Tristan ", "Times New Roman "};
			for(int i=0;i<fontStylesAvailable.length;i++)
			System.out.println(fontStylesAvailable[i]+"\t");
		}
		else if(Choice.equalsIgnoreCase("Color"))
		{
			String[] colorsAvailable = {"Red","Green","Blue","yellow","Magenta","Black","Brown","Gray"};
			for(int i=0;i<colorsAvailable.length;i++)
			System.out.println(colorsAvailable[i]+"\t");
		}
		else
		{
			System.out.println("invalid choice");
			ShowMenuItems();
		}
	}
	
	//takes user input from given items
	public void getMenuItem()
	{
		if(Choice.equalsIgnoreCase("FontSize"))
		{
			getFontSize();
		}
		else if(Choice.equalsIgnoreCase("FontStyle"))
		{
			 getFontStyle();
		}
		else if(Choice.equalsIgnoreCase("Color"))
		{
			 getcolor();
		}
	}
	
	//to get fontSize
	public int getFontSize()
	{
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		if(userInput==12||userInput==16||userInput==18||userInput==20||userInput==24)
		{
			FontSize = userInput;		
		    return userInput;
		}
		else
		{
			System.out.println("invalid choice");
			return getFontSize();
		}
	  }
	
	//to get fontStyle from user
	public String getFontStyle()
	{
		
		Scanner input = new Scanner(System.in);
		
	     String userInput = input.next();
	if(userInput.equalsIgnoreCase("Arial")||userInput.equalsIgnoreCase("Arial MT")||userInput.equalsIgnoreCase("Boulder")||userInput.equalsIgnoreCase("Tristan")||userInput.equalsIgnoreCase("Times New Roman"))
	 {
    FontStyle = userInput;
	 return userInput;
	 }
	else
	{
		System.out.println("invalid choice");
		return getFontStyle();
	}
}
	//to get color of font from user	
	public String getcolor()
	{
		Scanner input = new Scanner(System.in);
		String[] colorsAvailable = {"Red","Green","Blue","yellow","Magenta","Black","Brown","Gray"};
		String userInput = input.next();
		boolean contains = false;
				for(int i=0;i<colorsAvailable.length;i++)
				{
		if(colorsAvailable[i].equalsIgnoreCase(userInput))
			{
			color = userInput;
			contains = true;
		break;
		
			}
				}
		if(contains==false)
		{
			System.out.println("invalid choice");
			return getcolor();
		}
		else 
			return color;
	}
	
	}


	
	
	

