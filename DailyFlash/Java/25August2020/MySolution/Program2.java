/* Write a program that accepts an integer from user and print sum of all number up to entered number
Input : 10
Output : The sum number up to 10 : 55    */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		int sum =0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		for(int i=1; i<=num; i++)
			sum = sum + i;
		System.out.println("The sum number up to "+num+" : "+sum);
	}
}
