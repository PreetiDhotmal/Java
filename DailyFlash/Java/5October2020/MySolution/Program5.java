/* WAP to reverse an array of integer values. Enter number of rows : 6
INPUT : {12,34,56,78,90,01}
OUTPUT : {01,90,78,56,34,12}  */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size : ");
		int num = sc.nextInt();

		int arr[] = new int[num];

		System.out.print("Enter elements : ");
		for(int i=0; i<num; i++)
			arr[i] = sc.nextInt();

		for(int i=num-1; i>=0; i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
