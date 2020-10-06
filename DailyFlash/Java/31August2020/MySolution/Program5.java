/* Write a program that accepts an integer from user and print all of its perfect divisiors
Input : 24
Output : Perfect divisor of 24 are : 2 3 4 6 8 12  */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enetr number : ");
		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		System.out.print("Perfect divisor of "+num+" are : ");
		for(int i=1; i<num; i++)
			if(num % i == 0)
				System.out.print(i+" ");
		System.out.println();
	}
}
