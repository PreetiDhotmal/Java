/* Write a java program that accepts 2 dimensional array of rows and columns from user, print that 2D array in matrix form and print diagnonal elements of array 
Input : Enter number of rows : 3
	Enter number of cols : 3
Output : Entered matrix is :
	1 2 3
	4 5 6 
	7 8 9  
Digonal elements are : 1 5 9 */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows = ");
		int row = sc.nextInt();

		System.out.print("Enter number of cols = ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				arr[i][j] = sc.nextInt();

		System.out.println("Entered matrix is : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.print("Digonal elements are : ");
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				if(i == j)
					System.out.print(arr[i][j]+" ");
		System.out.println();
	}
}
