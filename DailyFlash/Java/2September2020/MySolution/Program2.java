/* Write a program that accepts two integer number from user and print minimum number from them 
Input : 56 99
Output : The minimum number amongst 56 & 99 is 56           */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		if(num1<num2)
			System.out.println("The minimum number amongst "+num1+" & "+num2+" is "+num1);
		else
			System.out.println("The minimum number amongst "+num1+" & "+num2+" is "+num2);
	}
}
