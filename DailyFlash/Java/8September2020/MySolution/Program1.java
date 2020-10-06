/* Write a program to that print the series which increment entered by user
Input : 15
Output : 1,16,31,46,...            */

import java.io.*;

class Program{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num = Integer.parseInt(s1);
		int val = 1;
		for(int i=1; i<=10; i++){
			
			System.out.print(val+" ");
			val = val + num;		
		}
		System.out.println();
	}
}
