/* Write a program that three integer from user and print maximum number from them 
Input : 56 7 99
Output : The maximum number amongst 56 7 & 99 is 99              */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		int res = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		String s3 = br.readLine();
		int num3 = Integer.parseInt(s3);

		res = (num1>num2 && num1>num3)? num1 : (num2>num1 && num2>num3)? num2 : num3;
		System.out.println("The maximum number amongst "+num1+" "+num2+" & "+num3+" is "+res);
	}
}
