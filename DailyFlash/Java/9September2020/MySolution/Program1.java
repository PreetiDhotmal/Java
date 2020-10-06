/* Write a program to that prints series of odd numbers in reverse order from the limiting number entered by user
Input: 100
Output : 99, 97, 95, 93 ... 1             */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num = Integer.parseInt(s1);
	
		for(int i=num; i>=1; i--)
			if(i % 2 != 0)
				System.out.print(i+" ");
		System.out.println();
	}
}
