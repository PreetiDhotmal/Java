/* Write a program that accepts two integer from user and print maximum number from them 
Input : 56 99
Output : The maximum number amongst 56 & 99 is 99    */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter first number : ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Enter second number : ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		if(num1>num2)
			System.out.println("The maximum number amongst "+num1+" & "+num2+" is "+num1);
		else
			System.out.println("The maximum number amongst "+num1+" & "+num2+" is "+num2);
	}
}
