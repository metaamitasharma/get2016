package DS_7;

import java.util.Scanner;
/**
 * DS-assignment 7
 * problem 1
 * Class BinarySearch_7 is to search an element in sorted array
 * it will always find the leftmost occurrence of x in the array 
 */

public class BinarySearch_7 {

	
	int inputArray[];
	int prev=-1;
	static int data;



	public int doBinarySearch(int input[],int lowIndex,int highIndex,int data){

	int mid;
	if(lowIndex>highIndex){            //base condition
	return prev;
	}
	else{
	mid=(lowIndex+highIndex)/2;

	if(input[mid]==data){
	prev=mid;                 //storing mid value in prev rather than returning this 
	}
	if(input[mid]>=data){
	return doBinarySearch( input,lowIndex, mid-1,data);  //recursive call
	}
	else if(input[mid]<data){
	return doBinarySearch( input,mid+1, highIndex,data);   //recursive call
	}

	}
	return prev;	
	}

	/*
	 * taking input array from user
	 */
	int[] takeInput(){

	Scanner scan=new Scanner(System.in);
	int noOfElements;	
	System.out.println("Enter the no of elements in array");
	noOfElements=scan.nextInt();
	inputArray=new int[noOfElements];
	for(int i=0;i<noOfElements;i++){

	System.out.println("Enter the elements");
	inputArray[i]=scan.nextInt();
	}


	System.out.println("Enter the element you want to search");
	data=scan.nextInt();
	return inputArray;
	}



	public static void main(String ar[]){

	int position,input[];
	BinarySearch_7 search=new BinarySearch_7();
	input=search.takeInput();
	position=search.doBinarySearch( input,0,input.length-1,data);
	if(position==-1){
	System.out.println("Element doesn't exist");
	}
	System.out.println("LOWEST POSITION OF SEARCHED ELEMENT IS "+position);

	}
}
