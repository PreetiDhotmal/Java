/* Write a java program that accepts 3 dimensional array of planes, rows, columns and sum of all elements from user and add all the elements
Input : Enter number of planes : 2
	Enter number of rows : 2
	Enter number of columns : 2
	Enter elements : 1 2 3 4 5 6 7 8
	Sum = 36 */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of planes : ");
		int plane = sc.nextInt();

		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		System.out.print("Enter number of columns : ");
		int col = sc.nextInt();

		int[][][] arr = new int[plane][row][col];
		int sum = 0;

		for(int i=0; i<plane; i++)
			for(int j=0; j<row; j++)
				for(int k=0; k<col; k++)
					arr[i][j][k] = sc.nextInt();

		for(int i=0; i<plane; i++)
			for(int j=0; j<row; j++)
				for(int k=0; k<col; k++)
					sum = sum + arr[i][j][k];

		System.out.println("Sum = "+sum);	
	}
}
