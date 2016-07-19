package permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
	ArrayList<String> as=new ArrayList<String>();
	void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
	
	ArrayList<String> findpermutation(char[] a, int n) {
	        if (n == 1)                                //base condition
	        {
	            String string=new String(a);
	            as.add(string);
	          //System.out.println(a);
	            
	        }
	        for (int i = 0; i < n; i++) {
	            swap(a, i, n-1);
	            findpermutation(a, n-1);
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