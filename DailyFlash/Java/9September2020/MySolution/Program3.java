/*Write a program to convert the hours entered by user into seconds
Input : 1 hr
Output : 3600 seconds            */

import java.io.*;

class Program{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter hours = ");
		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		int sec = (num * 60)*60;
		System.out.println(sec+" seconds");
	}
}
