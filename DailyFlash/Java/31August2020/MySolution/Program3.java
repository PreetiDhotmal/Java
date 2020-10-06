/* Write a program to print cubes and squares of all odd numbers ranges between given input number
Input : 10
Output : Cube of 1 : 1 and square os 1 : 1....      */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enetr number : ");
		String s1 = br.readLine();
		int num = Integer.parseInt(s1);
	
		for(int i=1; i<=num; i++){

			System.out.println("Cube of"+i+" : "+i*i);
			System.out.println("Square of"+i+" : "+i*i*i);
		}
	}
}
