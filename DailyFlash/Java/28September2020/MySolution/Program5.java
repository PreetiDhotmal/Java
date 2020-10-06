/* Write a program to print following binary pattern. Take number of rows from user using scanner class
Input : No of rows = 5
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
0 1 0 1 0   */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		for(int i=1; i<=num; i++){

			for(int j=1; j<=num; j++)
				if(i % 2 == 0)
					if(j % 2 == 0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				else
					if(j % 2 == 0)
						System.out.print("1 ");
					else
						System.out.print("0 ");
			System.out.println();
		}
	}
}
