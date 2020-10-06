/* Write a program to print series of add numbers ranging between two numbers entered by user 
Input : Min of series : 4
	Max of series : 60
Output : Series of odd numbers ranging between 4 & 60 is : 5, 7, 9, ... ,59.     */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enetr min number : ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Enetr max number : ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);
		
		for(int i=num1; i<=num2; i++)
			if(i % 2 != 0)
				System.out.print(i+" ");
		System.out.println();
	}
}
