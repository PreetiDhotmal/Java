/* Write a java program which takes input from user in array and print the greatest value of array */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements = ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		int max = 0;

		for(int i=0; i<num; i++)
			arr[i] = sc.nextInt();

		for(int i=0; i<num; i++)
			if(max < arr[i])
				max = arr[i];

		System.out.println("Maximum number = "+max);
	}
}
