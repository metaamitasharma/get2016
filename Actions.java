package MENU;

//class Actions Where actions are defined

public class Actions extends EditMenu{
	
	public void ActionPerform(EditMenu edit)
	{
		if(edit.Choice.equalsIgnoreCase("FontSize"))
		{
			changeFontSize(edit,edit.FontSize);
		}
		else if(edit.Choice.equalsIgnoreCase("FontStyle"))
		{
			changeFontStyle(edit, edit.FontStyle);
		}
		else if(edit.Choice.equalsIgnoreCase("Color"))
		{
			changeColor(edit, edit.color);
		}
	}
	
	
	public void changeFontSize(EditMenu edit,int newfontsize)
	{
		edit.FontSize = newfontsize;
		System.out.println("FontSize has been changed to "+ newfontsize);
	}
	
	public void changeFontStyle(EditMenu edit, String newStyle )
	{
		edit.FontStyle=newStyle;
		System.out.println("FontStyle has been changed to  " +newStyle);
	}
	public void changeColor(EditMenu edit,String newColor)
	{
		edit.color = newColor;
		System.out.println("Color has been changed to "+ newColor);
	}
	
}
