/* Write a program that accepts two integers from user and prints addition & Substraction of them {Note:checks for greater number to subtracts with while substracting numbers}
Input:10 20
Output : Addition is 30
Substraction is 10  */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);
	
		System.out.println("Addition is "+(num1+num2));

		if(num1>num2){
		
			System.out.println("Substraction is "+(num1-num2));
		}else{

			System.out.println("Substraction is "+(num2-num1));
		}
	}
}
