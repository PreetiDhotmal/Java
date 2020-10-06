/* Write a java program which takes input from user in array and print the sum of all elements */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements = ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		int sum = 0;

		for(int i=0; i<num; i++)
			arr[i] = sc.nextInt();

		for(int i=0; i<num; i++)
			sum = sum + arr[i];

		System.out.println("Sum of all numbers in array = "+sum);
	}
}
