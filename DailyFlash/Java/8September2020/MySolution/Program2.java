/* Write a program that takes rupees as input from user and convert them into dollars        */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter ruppes = ");
		String s1 = br.readLine();
		float num = Float.parseFloat(s1);
	
		double val = num / 73.78;

		System.out.printf("Dollars = %.1f\n",val);
	}
}
