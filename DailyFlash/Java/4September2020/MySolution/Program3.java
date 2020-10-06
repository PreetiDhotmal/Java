/* Write a program to take input length and breadth of rectangle and calculate its area 
Input :  10 20
Output : Area of rectangle = 200                */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Height = ");
		String s1 = br.readLine();
		int h = Integer.parseInt(s1);

		System.out.print("Width = ");
		String s2= br.readLine();
		int w = Integer.parseInt(s2);

		int A = h * w;
		System.out.println("Area of rectangle = "+A);
	}
}
