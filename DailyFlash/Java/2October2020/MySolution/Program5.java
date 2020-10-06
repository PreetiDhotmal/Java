/* Take 2D int array input(n*n) and print transpose of it
Input : 1 2 3
	4 5 6
	7 8 9

Output : 1 4 7
	 2 5 8
	 3 6 9 */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows = ");
		int row = sc.nextInt();

		System.out.print("Enter number of cols = ");
		int col = sc.nextInt();

		int[][] arr = new int[row][col];

		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				arr[i][j] = sc.nextInt();

		System.out.println("Input : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}

		for(int i=0; i<row; i++){

			int temp = 0;

			for(int j=0; j<col; j++){
				
				if(i==0){
					
					temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;

				}else if(i==1 && j==2){
					temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
		System.out.println("Output : ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}

	}
}
