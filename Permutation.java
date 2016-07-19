package permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
	//to find all possible permutations of given string
	
	ArrayList<String> Str =new ArrayList<String>();
	
	//swaps ith char with jth in given character array a
	void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
	
	ArrayList<String> findpermutation(char[] a, int n) {
	        if (n == 1)                                //base condition
	        {
	            String string=new String(a);           //converts char array to string
	            Str.add(string);                       //adding string to the Arraylist
	          //System.out.println(a);
	            
	        }
	        
	                                                 //recursive calls:
	        for (int i = 0; i < n; i++) {            //                          (abc,3)
	            swap(a, i, n-1);                    //       (cba,2)            (acb,2)             (abc,2)
	            findpermutation(a, n-1);         //    (bca,1)    (cba,1)   (cab,1)   (acb,1)   (bac,1)    (abc,1)   
	            swap(a, i, n-1);
	        }
	      
	        return as;
	    }  
	    
	    
public static void main(String[] args)
{
	Permutation obj = new Permutation();
	char[] a = {'a','b','c'};
	ArrayList<String> St= obj.findpermutation(a, 3);
	System.out.println(St);
}
}
