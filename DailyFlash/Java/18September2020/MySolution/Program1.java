/* Write a program to take user input, based on user's choice(Use of switch expected). And print the user input. The program should have choice for int, string*/

import java.io.*;

class Program{

	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);	
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter your choice : ");
		System.out.println("1 : Integer");
		System.out.println("2 : String");

		System.out.print("Enter your choice = ");
		String s1 = br.readLine();
		int ch = Integer.parseInt(s1);
		
		switch(ch){

			case 1: 
				System.out.print("Enter number = ");
				String s2 = br.readLine();
				int num = Integer.parseInt(s2);
				System.out.println("You have entered = "+num);
				break;
			case 2:
				System.out.print("Enter String = ");
				String str = br.readLine();
				System.out.println("You have entered = "+str);
				break;
		}	
	}
}
