/* Write a java program that accepts 2 dimensional array of rows and columns from user, print that 2D array in matrix form and print diagnonal elements of array 
Input : Enter number of rows : 3
	Enter number of cols : 3
Output : Entered matrix is :
	1 2 3
	4 5 6 
	7 8 9  
	Addition of row 0 = 6
	Addition of row 1 = 15
	Addition of row 2 = 24

	Addition of row 0 = 12
	Addition of row 1 = 15
	Addition of row 2 = 18 */

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
		System.out.println();
		for(int i=0; i<row; i++){
			int sum = 0;
			for(int j=0; j<col; j++)
				sum = sum + arr[i][j];
			System.out.println("Addition of row "+i+" = "+sum);
		}
		System.out.println();

		for(int i=0; i<row; i++){
			int sum = 0;
			for(int j=0; j<col; j++)
				sum = sum + arr[j][i];
			System.out.println("Addition of row "+i+" = "+sum);
		}
	}
}
