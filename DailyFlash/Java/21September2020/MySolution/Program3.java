/* Write a java Program that takes any year as input from user and prints whether that year is leap or not 
Input : 2017
Output : 2017 is not a leap year  */

import java.io.*;

class Program{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter year = ");
		String s1 = br.readLine();
		int year = Integer.parseInt(s1);

		if(year % 4 == 0)
			System.out.println("Year is leap year");
		else if(year % 2 == 0 && year % 400 == 0)
			System.out.println("Year is leap year");
		else
			System.out.println("Year is not leap year");
	}
}
