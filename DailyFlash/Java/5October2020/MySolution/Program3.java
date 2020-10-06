/* WAP that accepts two matrices of m*n order from user then add each element from those arrays and store the addition into third array.
Input : Enter rows(n) & cols(m) = 2 2
Enter matrix :
1 2	1 2
3 4	3 4
Output : The third matrix is : 
2 4 
6 8   */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row = ");
		int row = sc.nextInt();
		System.out.print("Enter col = ");
		int col = sc.nextInt();

		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		
		System.out.println("Enter elements for first array : ");
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				arr1[i][j] = sc.nextInt();
		System.out.println("Enter elements for second array : ");
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				arr2[i][j] = sc.nextInt();
		System.out.println("OUTPUT : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++)
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			System.out.println();
		}
	}
}
