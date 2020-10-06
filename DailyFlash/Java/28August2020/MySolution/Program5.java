/* Write a program to calculate the factorial of a given number
Input : 5
Output : The factorial of 5 is : 120   */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int fact=1;
		System.out.print("Enetr number : ");
		String s1 = br.readLine();
		int num = Integer.parseInt(s1);
		for(int i=1; i<=num; i++){

			fact = fact*i;
		}
		System.out.println("The factorial of "+num+" is : "+fact);
	}
}
