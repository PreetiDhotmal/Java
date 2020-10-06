/* Write a program that accepts two integer from user and prints addition of their cubes and substraction of their Squares
Input : 10 20
Output : Addition of 1000 & 8000 is 9000
	 Substraction of 100 & 400 is -300   */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.println("Addition is "+((num1*num1*num1)+(num2*num2*num2)));
		System.out.println("Substraction is "+((num1*num1)-(num2*num2)));
	}
}
