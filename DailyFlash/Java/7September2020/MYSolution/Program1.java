/* Write a program to swap two entered number without using the third temporary variable
Input : 10 20
Output : Before swap a = 10 & b = 20
	 After swap a = 10 & b= 20               */

import java.io.*;
import java.util.*;

class Program{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);
		
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);
		
		List<Integer> obj = new ArrayList<Integer>();
		obj.add(num1);
		obj.add(num2);

		System.out.println("Berfore swap : a = "+num1+" & b = "+num2);

		Collections.swap(obj,0,1);

		System.out.println("After swap : "+obj);
	}
}
