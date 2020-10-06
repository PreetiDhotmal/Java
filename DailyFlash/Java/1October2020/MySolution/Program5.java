/* Take size of the array from user. create two array of that size. Initialize all second array elements as zero(0). For the first array take all elements from user. Check if the elemet in first array is even or not if its even then replace the value of second array of that array of index with -1 and print both the arrays */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array : ");
		int num = sc.nextInt();

		int[] arr1 = new int[num];
		int[] arr2 = new int[num];

		System.out.println("Enter elements for array 1 = ");
		for(int i=0; i<num; i++)
			arr1[i] = sc.nextInt();

		System.out.println("Enter elements for array 2 = ");
		for(int i=0; i<num; i++)
			arr2[i] = sc.nextInt();

		for(int i=0; i<num; i++){
			int temp = 0;
			if(arr1[i] % 2 == 0){
				temp = arr2[i];
				arr2[i] = -1;
			}
		}

		System.out.print("Array 1 = ");
		for(int i=0; i<num; i++)
			System.out.print(arr1[i]+" ");
		System.out.println();

		System.out.print("Array 2 = ");
		for(int i=0; i<num; i++)
			System.out.print(arr2[i]+" ");
		System.out.println();
	}
}
