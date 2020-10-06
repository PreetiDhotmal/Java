/* write a program to simulate simple calculator. Accept two integers from user and sign of operation to perform
Input : Enetr first number : 10
	Enter second number : 20
	Enetr the sign of operation : +
Output : Addition of 10 & 20 is 30    */

import java.io.*;

class Program{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enetr first number : ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);
	
		System.out.print("Enetr second number : ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.print("Enetr the sign of Operation : ");
		char ch = (char)br.read();

		switch(ch){

			case '+':
				System.out.println("Addition of "+num1+" & "+num2+" is "+(num1+num2));
				break;
			case '-':
				if(num1>num2)
					System.out.println("Substraction of "+num1+" & "+num2+" is "+(num1-num2));
				else
					System.out.println("Substraction of "+num1+" & "+num2+" is "+(num2-num1));
				break;
			case '*':
				System.out.println("Multiplication of "+num1+" & "+num2+" is "+(num1*num2));
				break;
			case '/':
				if(num1>num2)
					System.out.println("Substraction of "+num1+" & "+num2+" is "+(num1/num2));
				else
					System.out.println("Substraction of "+num1+" & "+num2+" is "+(num2/num1));
				break;
			default:
				System.out.println("Wrong choice");
				break;
		}
	}
}
