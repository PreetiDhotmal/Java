/* Write a program which accepts two integer from user and swaps
Input : 20 30
Output : Before swap : 20 30
	 After swap : 30 20           */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException {

		int temp = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enetr first number : ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Enetr second number : ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.println("Before swap : "+num1+" "+num2);

		temp = num1;
		num1=num2;
		num2=temp;

		System.out.println("After swap : "+num1+" "+num2);

	}
}
