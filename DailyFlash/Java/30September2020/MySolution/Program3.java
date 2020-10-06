/* Write a java program which accepts marks of students in 1-D array & find total marks & percentage */

import java.util.*;

class Program {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of subjects : ");
		int num = sc.nextInt();

		int[] arr = new int[num];
		int sum = 0;

		System.out.println("Enter subject marks : ");
		for(int i=0; i<num; i++){

			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++){

			sum = sum + arr[i];
		}
		
		System.out.println("Total marks = "+sum);
		System.out.println("Percentage = "+sum/num+"%");
	}
}
