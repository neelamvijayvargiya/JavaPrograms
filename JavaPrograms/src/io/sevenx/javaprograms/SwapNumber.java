package io.sevenx.javaprograms;

public class SwapNumber {

	public static void main (String arg[])
	{
		//swap number without using third variable
	/*int a=60,b=40;
	
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println("a:" + a);
			System.out.println("b:" + b);*/
		
		
		//swap number using bitwise operator
		

        int x = 5, y = 10;
       
        x = x ^ y;
        y = x ^ y;
       
        x = x ^ y;
        System.out.println("The value of x is " + x
                           + " and the value of y is " + y);
    }
}
 