import java.util.*;

class MultiArray {

	public static void main(String[] args) {

		int arr[][] = {{1,2,3},{4,5,6},{7,8}};

		/* int marr[][] = new int[3][3];

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++){

			for(int j=0; j<3; j++)
				
				marr[i][j] = sc.nextInt();
		}*/

		System.out.println("Array elements are : ");
		for(int i=0; i<3; i++){

			for(int j=0; j<3; j++)
				
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}
