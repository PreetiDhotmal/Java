/* Write a java program which takes input from user in array and print the array in reverse order */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements = ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for(int i=0; i<num; i++)
			arr[i] = sc.nextInt();

		for(int i=num-1; i>=0; i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
