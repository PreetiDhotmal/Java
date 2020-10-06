/* Write a java program that takes 3 integer as input from user and prints the largest number entered amongst them
Input : 2 8 5
Output : 8 is largest number entered amongst 2 8 5 */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		String s3 = br.readLine();
		int num3 = Integer.parseInt(s3);

		int res = (num1>num2 && num1>num3)? num1 : (num2>num1 && num2>num3)? num2 : num3;
		System.out.println(res+" is largest number entered amongst "+num1+" "+num2+" "+num3);
	}
}
