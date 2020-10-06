/* Write a program where in-side main() method create 2 objects of BufferedReader class as brOne and brTwo take your name as input from brOne onject, take surname as input from brTwo and print them. (Do not forget to call close after using brOne and brTwo)
Input : Enter name : Preeti
	Enter surname : Dhotmal
Output : Preeti Dhotmal  */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader brOne = new BufferedReader(isr);
		
		System.out.print("Enter name = ");
		String s1 = brOne.readLine();
		
		BufferedReader brTwo = new BufferedReader(isr);
		
		System.out.print("Enter surname = ");
		String s2 = brTwo.readLine();
		System.out.println(s1+" "+s2);
	}
}
