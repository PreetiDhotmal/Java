/* Write a program to print cubes and squares of all even numbers range between given input number
Input : 10
Output : Cube of 2 : 8 and square of 2 : 4     */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		for(int i=1; i<=num; i++)
			if(i % 2 == 0){
				System.out.println("Cube of "+i+" : "+i*i*i);
				System.out.println("Square of "+i+" : "+i*i);
			}
	}
}
