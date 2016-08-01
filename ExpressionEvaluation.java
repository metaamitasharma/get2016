package DSsession1;

import java.util.Scanner;
/**
 * 
 * Class ExpressionEvaluation for converting infix to postfix expression
 * stack is used 
 * LinkedList is used for storing postfix expression
 *
 */

public class ExpressionEvaluation {
	
	public LinkedList<Character> ExpressionList = new LinkedList<Character>();
	public stack<Character> stk=new stack<Character>();
	 
	
	public  ExpressionEvaluation()
	{
		ExpressionList.addAtFront(' ');
		 stk.push('(');                   //initially pushing '(' to the stack
	}
	
	
	/*
	 * method evaluates postfix expression corresponding infix "expression" taking as argument
	 */
	public void infixToPostfix(String expression)
	{
		
		int index=0;
		while(index<expression.length())
		{
		 //ch is current character of given infix string
		char ch = expression.charAt(index);
		index++;
		
	/*
	 * if char is an operator
	 * Check Whether There is any Operator Already present in Stack or not.
     */
		if(is_operator(ch))
		{
			char x=(char) stk.pop();
			   while(is_operator(x)&& precedence(x)  //check precedence of popped operator
			    >= precedence(ch))                    
			   {
			   ExpressionList.add(x);            //if precedence is higher than ch add it to List
			    x = (char) stk.pop();           //repeating this until an operator with lower 
			   }                               //precedence comes on top of the stack
			   stk.push(x);
			   stk.push(ch);			
		}
		else
		{   
			//if ch is Opening Bracket 
			//push onto the stack
			if(ch =='(')
			{
				stk.push(ch);
			}
			//if it's an alphabet add to the list
			else if((ch >= 'A'  && ch <= 'Z') || 
					  (ch >= 'a' && ch <= 'z'))
			{
				ExpressionList.add(ch);
			}
			
			//finally is it's closing bracket 
			//pop elements from stack one by one and add to list
			//till '(' is not encountered
			else if(ch==')')
			{
				while((char)stk.top.value!='(')
				{
					char temp =(char) stk.pop();
					ExpressionList.add(temp);
					
				}
				
			}
			
			}
		
		}
		//finally adding rest elements from stack to the list
		char temp =(char) stk.pop();
		ExpressionList.add(temp);
		
	}
	
	
	public boolean is_operator(char symbol)
	{
	 if(symbol == '^'|| symbol == '*' || symbol == '/' || 
	 symbol == '+' || symbol == '-')
	 {
	  return true;
	 }
	 else
	 {
	  return false;
	 }
	}

	
public int precedence(char symbol)
	{
	 if(symbol == '^')
	 {
	  return(3);
	 }
	 else if(symbol == '*' || symbol == '/')
	 {
	  return(2);
	 }
	 else if(symbol == '+' || symbol == '-')
	 {
	  return(1);
	 }
	 else
	 {
	  return(0);
	 }
	}


public static void main(String args[])
{
	ExpressionEvaluation obj = new ExpressionEvaluation();
	String infix;
	Scanner input = new Scanner(System.in);
	System.out.println("enter infix expression ");
	infix = input.next();
	obj.infixToPostfix(infix);
	obj.ExpressionList.display();
	
	
}
}
