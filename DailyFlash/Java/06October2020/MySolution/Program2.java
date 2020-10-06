/* Write a java program that accepts 3D array of planes,rows,columns from user, print that 3D array in matrix form and print first plane
Input : Enter number of planes = 2
	Enter number of rows = 2
	Enter number of columns = 2
	Enter elements = 10 20 30 40 50 60 70 80
Output : Print the first plane : 10 20
				 30 40	*/

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

		for(int i=0; i<plane; i++)
			for(int j=0; j<row; j++)
				for(int k=0; k<col; k++)
					arr[i][j][k] = sc.nextInt();
		System.out.println("The first plane = ");
		for(int i=0; i<1; i++)
			for(int j=0; j<row; j++){
				for(int k=0; k<col; k++)
					System.out.print(arr[i][j][k]+" ");
				System.out.println();
			}
	}
}
