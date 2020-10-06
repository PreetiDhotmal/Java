import java.util.*;

class Jagged3D {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int[][][] arr = new int[2][3][];

		arr[0][0] = new int[] {1,2};
		arr[0][1] = new int[] {3,4,5};
		arr[0][2] = new int[] {6,7,8,9};

		arr[1][0] = new int[] {1,2,3};
		arr[1][1] = new int[] {4};
		arr[1][2] = new int[] {5,6,7,8};

		for(int i=0; i<arr.length; i++){
			System.out.println("Enter elements for plane "+i+" = ");
			for(int j=0; j<arr[i].length; j++)
				for(int k=0; k<arr[i][j].length; k++)
					arr[i][j][k] = sc.nextInt();
		}

		for(int i=0; i<arr.length; i++){
			System.out.println("Plane "+i+" = ");
			for(int j=0; j<arr[i].length; j++){
				for(int k=0; k<arr[i][j].length; k++)
					System.out.print(arr[i][j][k]+" ");
				System.out.println();
			}
			System.out.println();
		}
	}
}
