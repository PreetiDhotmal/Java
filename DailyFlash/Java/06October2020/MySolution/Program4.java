/* Write a java program that accepts 3D array of planes,rows,columns from user. Print even number
Input : Enter number of planes : 2
	Enter number of rows : 2
	Enter number of columns : 2
	Enter elements : 20 22 35 36 45 67 88 55
Output : Even numbers are : 20 22 36 88	 	*/

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of planes : ");
		int plane = sc.nextInt();

		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		System.out.print("Enter number of columns : ");
		int col = sc.nextInt();

		int[][][] arr = new int[plane][row][col];

		System.out.println("Enter elements : ");
		for(int i=0; i<plane; i++)
			for(int j=0; j<row; j++)
				for(int k=0; k<col; k++)
					arr[i][j][k] = sc.nextInt();

		System.out.print("Even numbers are : ");
		for(int i=0; i<plane; i++)
			for(int j=0; j<row; j++)
				for(int k=0; k<col; k++)
					if(arr[i][j][k] % 2 == 0)
						System.out.print(arr[i][j][k]+" ");
		System.out.println();
	}
}
