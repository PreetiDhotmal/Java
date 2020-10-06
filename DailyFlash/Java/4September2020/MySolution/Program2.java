/* Write a program that accepts an integer from user and prints its second successor and second predecessor
Input : 50
Output : Second Predecessor : 48
	 Second Successor : 52          */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter number : ");
		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		System.out.println("Second Predecessor = "+(num-2));
		System.out.println("Second Predecessor = "+(num+2));
	}
}
