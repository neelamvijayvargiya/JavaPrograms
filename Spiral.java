package io.sevenx.javaprograms;

public class Spiral {
	
	 
	static void printSpiralPattern(int size)  
	{  
	//create two variables row and col to traverse rows and columns  
	int row = 0, col = 0;  
	int boundary = size - 1;  
	int sizeLeft = size - 1;  
	int flag = 1;  

	char move = 'r';  
	//creating a 2D array for matrix  
	int[][] matrix =new int [size][size];  
	for (int i = 1; i < size * size + 1; i++)  
	{  
	    //assigning values  
	    matrix[row][col] = i;  
	 
	    switch (move)  
	    {  
	    //if right, go right  
	    case 'r':  
	        col += 1;  
	        break;  
	    //if left, go left  
	    case 'l':  
	        col -= 1;  
	        break;  
	    //if up, go up  
	    case 'u':  
	        row -= 1;  
	        break;  
	    //if down, go down  
	    case 'd':  
	    	 row += 1;  
	    	    break;  
	    	}  
	   
	    	if (i == boundary)  
	    	    {  
	    	        
	    	        boundary = boundary + sizeLeft;  
	    	         
	    	        if (flag != 2)  
	    	        {  
	    	        flag = 2;  
	    	        }  
	    	        else  
	    	        {  
	    	        flag = 1;  
	    	        sizeLeft -= 1;  
	    	        }  
	    	       
	    	        switch (move)  
	    	        {  
	    	      //if right, rotate to down  
	    	        case 'r':  
	    	            move = 'd';  
	    	            break;  
	    	        // if down, rotate to left  
	    	        case 'd':  
	    	            move = 'l';  
	    	            break;  
	    	        // if left, rotate to up  
	    	        case 'l':  
	    	            move = 'u';  
	    	            break;  
	    	        // if up, rotate to right  
	    	        case 'u':  
	    	            move = 'r';  
	    	            break;  
	    	        }  
	    	    }  
	    	    }  
	    	//printing the spiral matrix or pattern  
	    	//outer for loop for rows  
	 for (row = 0; row < size; row++)  
	    {  
	        //inner for loop for columns  
	        for (col = 0; col < size; col++)  
	            {  
	                int n = matrix[row][col];  
	                if(n < 10)  
	                    System.out.print(n +" ");  
	                else  
	                    System.out.print(n +" ");  
	            }  
	        System.out.println();  
	    }  
	}  
 
	public static void main(String args[])  
	{  

	int size = 5;  
	System.out.println("Spiral Matrix or Pattern is: \n");  
	   
	printSpiralPattern(size);  
	}  
	}  
	    	        


