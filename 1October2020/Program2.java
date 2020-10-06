import java.util.*;

class ArrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows = ");
		int row = sc.nextInt();
		System.out.print("Enter cols = ");
		int col = sc.nextInt();

		char[][] marr = new char[row][col];

		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++)
				
				marr[i][j] = sc.next().charAt(0);
		}

		for(int i=0; i<row; i++){

			for(int j=0; j<col; j++)
				
				System.out.print(marr[i][j]+" ");
			System.out.println();
		}
	}
}
