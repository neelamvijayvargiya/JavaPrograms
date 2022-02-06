//Java Program to copy all elements of one array into another array
package io.sevenx.javaprograms;

public class CopyArrayElement {
    
	    public static void main(String[] args) {        
	           
	        int arr1[] = new int [] {5,9,8,6,3};
	        
	        int arr2[] = new int[arr1.length];  
	           
	         for(int i=0;i<arr1.length;i++)
	         {
	        	 arr2[i]=arr1[i];
	         }
	        	
	        System.out.println("First array element:"); 
	        for(int i=0;i<arr1.length;i++) {
	     
	        System.out.print(arr1[i] + " ");    
	        }     
	         
	        
	        System.out.println("Second array element: ");    
	   	    for(int i=0;i<arr1.length;i++) {     
	           System.out.print(arr2[i] + " ");    
	        }     
	    }    
	 
}