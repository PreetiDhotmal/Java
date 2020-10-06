/* Write a java program to take name, roll number and field of interest from user and print in the format below : 
Input : Name = Rosh
	Roll no = 101
	Field of interest : art
Output : Hey, my name is Rosh and my roll number is 101. My field of interest are Art.  */

import java.util.*;

class Program {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter roll number = ");
		int rollno = sc.nextInt();
		System.out.print("Enter name = ");
		String name = sc.next();
		System.out.print("Enter field of interest = ");
		String field = sc.next();

		System.out.println("Hey, my name is "+name+" and my roll number is "+rollno+". My field of interest are "+field+".");
	}
}
