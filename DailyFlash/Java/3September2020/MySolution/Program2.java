/* Write a program that accepts two integer from user and print the series of factorial of all numbers between those two inputs
Input : 1 to 5
Output : Factorial of 1 : 1 ... Factorial of 5 : 120                */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		for(int i=num1; i<=num2; i++){
	
			int fact = 1;
			for(int j=1; j<=i; j++)
				fact = fact * j;
			System.out.println("Factorial of "+i+" : "+fact);
		}
	}
}
