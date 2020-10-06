/* WAP to insert an element (specific position) into an array
INPUT : rows : 10
Original  Array : {25,14,56,15,36,56,77,18,29,49};
Enter index at which you want to add element : 2
Enter number to add : 5
OUTPUT : New Array : {25,14,5,56,77,18,29,49}  */

import java.util.*;

class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Array[] = {25,14,56,15,36,56,77,18,29,49};

		System.out.print("Enter index at which you want to add element : ");
		int num1 = sc.nextInt();
		System.out.print("Enter number to add : ");
		int num2 = sc.nextInt();

		for(int i=0; i<10; i++)
			if(num1 == i){
				
				int temp = Array[i];
				Array[i] = num2;
			}
		for(int i=0; i<10; i++)
			System.out.print(Array[i]+" ");
		System.out.println();
	}
}
