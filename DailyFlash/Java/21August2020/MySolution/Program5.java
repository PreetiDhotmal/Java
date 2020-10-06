/* Write a program to ASCII values of input character
Input : A
Outpu : ASCII Value of A is 65
*/

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter character = ");
		int ch = (int)br.read();
		System.out.println(ch);
	}
}
