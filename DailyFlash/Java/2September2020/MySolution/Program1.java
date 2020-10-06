/* Write a program to print series of even numbers ranging between two number entered by user
Input : Min of series : 4
	Max of series : 60
Output : Series of even numbers ranging between 4 & 60 is : 4 6 8 ... 60               */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Min of series : ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Max of series : ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.print("Series of even number ranging between "+num1+" & "+num2+" is : ");
		for(int i=num1; i<=num2; i++)
			if(i % 2 == 0)
				System.out.print(i+" ");
		System.out.println();
	}
}
