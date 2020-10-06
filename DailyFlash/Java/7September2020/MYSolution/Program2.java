/* Write a program that calculates Kinetic Energy of object with given Mass & Velocity {Note : K.E = 1/2 * m * v * v}
Input : Mass = 53 kg Velocity = 5m/s
Output : Kinetic Energy of that object is : 662.5             */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Mass = ");
		String s1 = br.readLine();
		int mass = Integer.parseInt(s1);

		System.out.print("Velocity = ");
		String s2 = br.readLine();
		int vel = Integer.parseInt(s2);

		double res = 0.5 * mass * vel * vel;
		System.out.println("Kinetic Energy of that object is : "+res);
	}
}
