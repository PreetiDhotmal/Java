/* Write a program to accept 10 integers from user and prints the sum & average of entered number
Input : 1 2 3 4 5 6 7 8 9 10
Output : Sum of 10 entered number is : 55
	Average of 10 entered number is : 5.55    */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		int sum=0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		for(int i=1; i<=10; i++){

			String s1 = br.readLine();
			int num = Integer.parseInt(s1);
			sum = sum + num;
		}
		System.out.println("Sum of 10 entered number is : "+sum);
		System.out.println("Average of 10 entered number is : "+(sum/10));
	}
}
