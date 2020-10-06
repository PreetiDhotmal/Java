/* WAP that accepts 2D array of M rows and N Columns from user and print only addition of even elements multiplied by max odd element from that array.
Input : Enter number of rows & cols : 3 3
elements :
1 2 3
3 4 5
5 6 7
Output : Sum of even elements 12 max odd elemet : 7
Expected output : 12 * 7 = 84  */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row and col : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		int sum1=0, max=0;
	
		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++)
				
				arr[i][j] = sc.nextInt();
		}
		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++)
				
				if(arr[i][j] % 2 == 0)
					sum1 = sum1 + arr[i][j];
				else
					if(arr[i][j] > max)
						max = arr[i][j];
		}

		System.out.println("Sum of even elements "+sum1+" max odd element : "+max);
		System.out.println(sum1+" * "+max+" = "+(sum1*max));
	}
}
