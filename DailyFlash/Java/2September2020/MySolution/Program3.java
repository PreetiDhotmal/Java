/* Write a program to calculate velocity of particle in the space having Distance & Time entered by user
Input : Distance = 100
	Time = 20                  */

import java.io.*;
	
class Program {

	public static void main(String[] args)throws IOException {

		int v=0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Distance = ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Time = ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		v = num1/num2;

		System.out.println("The velocity of a particle roaming in space is "+v+"m/s");
	}
}
