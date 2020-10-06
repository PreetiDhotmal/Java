/* Write a java program to take two string as a input from user using scanner and print them in same line. And add space between them
Input : String1 = Vijay
	String2 = Devarkonda
Output : Vijay Devarkonda  */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String1 = ");
		String s1 = sc.next();
		System.out.print("String2 = ");
		String s2 = sc.next();

		System.out.println(s1+" "+s2);
	}
}
