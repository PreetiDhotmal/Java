/* write a program to that accepts two integer from user and calculates the Quotient & Reminder from their division
Input : 10 5
Output : Quotient = 2
	 Reminder = 0               */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.println("Quotient = "+(num1/num2));
		System.out.println("Reminder = "+(num1%num2));
	}
}
