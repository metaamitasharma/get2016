package DSassignment_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
/**
 * DS assignment 5  problem 1
 * class concordanceString is to calculate indices of each individual character in a string
 * hashMap is used here for mapping
 */

public class concordanceString {
	
	HashMap<Character,ArrayList<Integer>> map = new HashMap<Character,ArrayList<Integer>>();
	String myString;
	Scanner sc=new Scanner(System.in);
	
	
	 /*
	  * to get String from user
	  */
	public void getString()
	{
		try
		{
			System.out.println("enter string");
			myString = sc.nextLine();
		}
		catch(Exception ex)
		{
			System.out.println("string should not be empty , enter again");
			getString();
		}
	}
	
	/*
	 *  calculating occurrence indices of characters and storing the indices in array-list
	 */
	public void mapConcordance()
	{
		for(int i=0;i<myString.length();i++)
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			char ch = myString.charAt(i);
			
			//if any character is being  repeated then avoid 
			if(!map.containsKey(ch))
			{
			for(int j=0;j<myString.length();j++)
			{
				if(myString.charAt(j)==ch)
				{
					list.add(j);
				}
			}
			
		map.put(ch, list);	
			}
		}
	}
	

	
	public static void main(String args[])
	{
		concordanceString obj = new concordanceString();
		obj.getString();
		obj.mapConcordance();
		System.out.println(obj.map);
	}

}
