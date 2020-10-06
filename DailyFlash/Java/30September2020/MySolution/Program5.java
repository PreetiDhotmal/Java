/* Write a java program to take 10 integer inputs from user and print the following : number of positive numbers, number of negative numbers, number of odd numbers, number of even numbers, number of 0's */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int count1=0, count2=0, count3=0, count4=0, count5=0;

		for(int i=0; i<10; i++)
			arr[i] = sc.nextInt();

		for(int i=0; i<10; i++)
			if(arr[i] % 2 == 0)
				count1++;
			else
				count2++;

		for(int i=0; i<10; i++)
			if(arr[i] == 0)			
				count3++;
		
		for(int i=0; i<10; i++)
			if(arr[i] >= 0)
				count4++;
			else
				count5++;

		System.out.println("Number of positive numbers = "+count4);
		System.out.println("Number of negative numbers = "+count5);
		System.out.println("Number of even numbers = "+count1);
		System.out.println("Number of odd numbers = "+count2);
		System.out.println("Number of 0's = "+count3);
	}
}
