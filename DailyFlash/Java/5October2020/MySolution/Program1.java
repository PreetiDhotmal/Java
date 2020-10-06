/* WAP that accepts two Array of legth N from user and Computes multiplication of elements at same index from those array and stores that multiplication into third array at the same index, Print the third array.
INPUT : Length of array : 6
Enter elements in first array : 1 4 3 2 5 6
Enter elements in second array : 1 2 3 4 5 6
OUTPUT : After operation the elements in third array : 1 6 9 8 25 36 */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int num = sc.nextInt();
	
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		int[] arr3 = new int[num];

		System.out.print("Enter elements in firat array : ");
		for(int i=0; i<num; i++)
			arr1[i] = sc.nextInt();

		System.out.print("Enter elements in second array : ");
		for(int i=0; i<num; i++)
			arr2[i] = sc.nextInt();

		for(int i=0; i<num; i++)
			arr3[i] = arr1[i] * arr2[i];

		for(int i=0; i<num; i++)
			System.out.print(arr3[i]+" ");
		System.out.println();
	}
}
