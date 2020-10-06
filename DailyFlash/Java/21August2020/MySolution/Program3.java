/* Ask user to enter age, sex(M or F), marital status(Y or N) and then using following rules print their place of service if employee if female,then she will work only in urban areas. If employee is a male and age is in between 20 to 40 then he may work in anywhere. if employee is male and age is in between 40 to 60 then he will work in urban area only and any other input of age should print "ERROR". */

import java.io.*;

class Program{

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter age = ");
		String s = br.readLine();
		int age = Integer.parseInt(s);

		System.out.print("Enter gernder(M or F) = ");
		char gender = (char)br.read();

		System.out.print("Enter Marital status(Y or N) = ");
		String line = br.readLine();
		char Mstatus = (char)br.read();		
	
		if(gender == 'F' || gender == 'f')
			System.out.println("Employee can work in urban areas");
		else if(gender == 'M' || gender == 'm')
			if(age>=20 && age<=40)
				System.out.println("Employee can work anywhere");
			else if(age>40 && age<=60)
				System.out.println("Employee can work in urban areas");
	
		else
			System.out.println("ERROR");
	}
}
