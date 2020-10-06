/* write a program to calculate area of circle */

import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{

		double area;

		System.out.println("Enter radius of circle = ");

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String i = br.readLine();	
		int radius = Integer.parseInt(i);

		area = 3.14*(radius*radius);
		System.out.println("Area of circle = "+area);
	}
}
