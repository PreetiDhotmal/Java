/* Wrrite a program that accepts two integer from user and prints multiplication & Division of them{Note:checks for smaller divisor amongst entered number while computing division}
Input : 10 20
Output : Multiplication is 200
	 Division is 2    */

import java.io.*;

class Program{

	public static void main(String[] args)throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.println("Multiplication is "+(num1*num2));

		if(num1<num2)
			System.out.println("Division is "+(num2/num1));
		else
			System.out.println("Division is "+(num1/num2));
	}
}
