/* Write a program to implement Ohms Law {Note: V = I * R where, v is voltage, I is currect & R is resistance}
Input : I = 10 amp
	R = 5
Output : Voltage V = 50              */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("I = ");
		String s1 = br.readLine();
		int i = Integer.parseInt(s1);

		System.out.print("R = ");
		String s2 = br.readLine();
		int r = Integer.parseInt(s2);

		int v = i*r;
		System.out.println("Voltage V = "+v);
	}
}
