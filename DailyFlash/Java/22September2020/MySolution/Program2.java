/* Write a program to take integer value from user in loop, display sum of value's entered, if value entered is greater than 50 then break the loop(choose any loop of your choice)
Input : 1 5 10 15 60
Output : sum = 9  */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i=1, sum=0;
		while(i!=0){
			
			String s1 = br.readLine();
			int num = Integer.parseInt(s1);
			if(num>=50)
				break;
			else
				sum = sum + num;
		}
		System.out.println("Sum = "+sum);
	}
}
