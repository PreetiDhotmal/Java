/* Write a program to take one side of square from user using BufferedReader & print area & perimeter of that square 
Length of side : 2 
Area : 4
Perimeter : 8  */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//String s1 = br.readLine();
		System.out.print("Length of side : ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Area = "+(num*num));
		System.out.println("Perimeter = "+(num*num*num));
	}
}
