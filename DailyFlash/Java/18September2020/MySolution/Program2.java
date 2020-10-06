/* Write a program to that prints series Square of even number and cube of odd number between the limits entered by user
Input 1 10
Output : 1 4 27 16 125 36 343 64 729 100 */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		for(int i=num1; i<=num2; i++)
			if(i % 2 == 0)
				System.out.print((i*i)+" ");
			else
				System.out.print((i*i*i)+" ");
		System.out.println();
	}
}
