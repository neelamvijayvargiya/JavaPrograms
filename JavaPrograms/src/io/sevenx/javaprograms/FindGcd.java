//Java Program to Find GCD of Two Numbers
package io.sevenx.javaprograms;

public class FindGcd {
	
    public static void main(String[] args) {
    	int n1=62, n2=42;  
    	while(n1!=n2)   
    	{  
    	if(n1>n2)  
    	n1=n1-n2;  
    	else  
    	n2=n2-n1;  
    	}  
    	System.out.printf("GCD of n1 and n2 is: " +n2);  
    	}  
    	}  
	

