//Java Program to Add Two Matrices
package io.sevenx.javaprograms;

public class MatrixAddition {
		public static void main(String args[]) {
			int a[][]={{6,5,4},{7,4,2},{6,4,8}};    
			int b[][]={{3,9,8},{2,4,6},{2,2,8}};    
			
			int c[][]=new int[3][3];
			
			for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){  
	/*addition of matrices */
			c[i][j]=a[i][j]+b[i][j];    
			System.out.print(c[i][j]+" ");  
			
			}    
			System.out.println();//new line    
			}    
			}
		}  

