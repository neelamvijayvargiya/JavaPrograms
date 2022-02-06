//JAVA Program to Reverse a number 
package io.sevenx.javaprograms;

public class ReverseNumber 
	{  
		public static void main(String[] args)   
		{  
		/*int number = 638475, reverse = 0;  
	
		for( ;number != 0; number=number/10)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  */
			
			
			//Or we can do by another method i.e by while loop
			
			int number = 574836, remainder,reverse = 0; 
			while (number!=0)
			{
				remainder = number % 10; 
				reverse = reverse * 10 + remainder;
				number=number/10;
			}
				System.out.println( reverse);
				}
				
		}  
		 


