/* Write a java program which take age of students, find maximum age. Take value from user */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students = ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		int max = 0;

		System.out.println("Enter age = ");
		for(int i=0; i<num; i++)
			arr[i] = sc.nextInt();

		for(int i=0; i<num; i++)
			if(max < arr[i])
				max = arr[i];

		for(int i=0; i<num; i++)
			if(max == arr[i])
				System.out.println("Maximum number index is = "+i);
	
	}
}
