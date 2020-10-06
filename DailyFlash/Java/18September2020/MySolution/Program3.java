/* Write a program to that prints the series which increments with the number entered by user(1 to 50)
Input : 4
Output : 1 5 9 13 17 ... */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		int val = 1;
		for(int i=1; i<=50; i++){
			System.out.print(val+" ");
			val+=num;
		}
		System.out.println();
	}	
}
