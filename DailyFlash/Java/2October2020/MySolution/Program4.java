/* Write a java Program that accepts 2D array of rows and columns from user. Print 2D array, print a hour glass structure for eg :-
1 2 3 4
5 6 7 8
9 10 11 12

hour glass structure is :-
	1 2 3
	  6
	9 10 11
hour glass structure is :-
	2 3 4
	  7
	10 11 12 */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows : ");
		int row = sc.nextInt();

		System.out.print("Enter number of cols : ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				arr[i][j] = sc.nextInt();

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}
