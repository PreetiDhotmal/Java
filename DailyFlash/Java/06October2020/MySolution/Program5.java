/* Write a java program that accepts 3D array and print number divisible by 5 from all
Input : Enter number of planes : 2
	Enter number of rows : 2
	Enter number of columss : 2
	Enter elements : 4 75 56 10 12 45 77 60
	Divisible by 5 : 75 10 45 60  	*/

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

		System.out.println("Enter elements = ");
		for(int i=0; i<plane; i++)
			for(int j=0; j<row; j++)
				for(int k=0; k<col; k++)
					arr[i][j][k] = sc.nextInt();

		System.out.print("Divisible by 5 = ");
		for(int i=0; i<plane; i++)
			for(int j=0; j<row; j++)
				for(int k=0; k<col; k++)
					if(arr[i][j][k] % 5 == 0)
						System.out.print(arr[i][j][k]+" ");		
		System.out.println();
	}
}
