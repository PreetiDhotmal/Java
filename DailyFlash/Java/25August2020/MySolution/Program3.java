/* Write a program that accepts an integer from user and prints whether that number is odd or even
Input : 2
Output : 2 is an even number   */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		if(num % 2 == 0)
			System.out.println(num+" is an Even number");
		else
			System.out.println(num+" is an Odd number");
	}
}
