package pf1assignment1;

public class assignment {
	//power function will return x^y
	int pow(int x,int y){
		int xPOWy=1;int temp;
		for(temp=0;temp<y;temp++)
		{ 
			xPOWy=xPOWy*x;
		}
		return xPOWy;
	}
	//method to convert binary triplet into equivalent decimal
	int tripletToDecimal(int triplet)
	{
		int num,count=0,dec=0;
		num=triplet;
		while(num>0)
		{
			dec=dec+((num%10)*pow(2,count++));
			num=num/10;
		}
		return dec;
	}
	//exp: 100110
	//frst convert last 3(triplet) ie 110=6
	//now next triplet 100=4
	//ans=46
	int convertBinarytoOctal(int n)
	{
		int rem,place=0,octal=0;
		while(n>0)
		{
			rem=n%1000;
			octal=octal+(tripletToDecimal(rem))*pow(10,place++) ;
			n=n/1000;
			
		}
		
		return octal;
	}
}

