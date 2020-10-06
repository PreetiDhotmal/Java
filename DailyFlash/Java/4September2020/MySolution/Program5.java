/* Write a program which accepts data month and year from user and checks for the validity of date according to month
Input : 30/02/2018
Output : Date doesn't exists!!               */

import java.io.*;

class Program {

	public static void main(String[]args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter date : ");
		String s1 = br.readLine();
		int date = Integer.parseInt(s1);

		System.out.print("Enter month : ");
		String s2 = br.readLine();
		int month = Integer.parseInt(s2);

		System.out.print("Enter year : ");
		String s3 = br.readLine();
		int year = Integer.parseInt(s3);

		if(date>=1 && date<=28)
			if(month>=1 && month<=12)
				System.out.println("Date is exists!!");
			else
				System.out.println("Date doesn't exists!!");
		else if(date>28 && date<=30)
			if(month>=3 && month<=12 || month==1)
				System.out.println("Date is exists!!");
			else
				System.out.println("Date doesn't exists!!");
		else if(date==31)
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
				System.out.println("Date is exists!!");
			else
				System.out.println("Date doesn't exists!!");
		else
			System.out.println("Date doesn't exists!!");
	}
}
