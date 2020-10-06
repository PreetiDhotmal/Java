/* Write a program that takes electricity unit charges as input and calculate total electricity bill according to the given condition: 
for first 50 units Rs. 0.50/Unit
for next 100 units Rs. 0.75/Unit
for next 100 units Rs. 1.20/Unit
for unit above 250 Rs. 1.50/Unit
*/

import java.io.*;

class Program{

	public static void main(String[] args) throws IOException{

		double res;

		System.out.print("Enter unit = ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		String s = br.readLine();
		int unit = Integer.parseInt(s);
		
		if(unit<=50)
			res = unit * 0.50;
		else if(unit>50 && unit<=150)
			res = unit * 0.75;
		else if(unit>150 && unit<=250)
			res = unit * 1.20;
		else
			res = unit * 1.50;
		System.out.println("Electricity bill = "+res);
	}
}
