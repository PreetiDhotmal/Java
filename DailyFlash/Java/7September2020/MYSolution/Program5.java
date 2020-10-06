/*     */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Imaginary : ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Enter Real part : ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.print("Enter Imaginary : ");
		String s3 = br.readLine();
		int num3 = Integer.parseInt(s3);

		System.out.print("Enter Real part : ");
		String s4 = br.readLine();
		int num4 = Integer.parseInt(s4);

		System.out.println("The addition : "+num1+"+"+num2+"i & "+num3+"+"+num4+"i is "+(num1+num3)+"+"+(num2+num4)+"i");
	}
}
