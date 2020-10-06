/* Write a program that accepts an integer from user and print it 
Input : 11
Output : 11   */

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num = Integer.parseInt(s1);
		System.out.println(num);
	}
}
