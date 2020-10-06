/* Write a program which detects whether the entered number is perfect or noy {Note : If sum ofperfect devisor of number is equal to the entered number than it is considered as perfect one}
Input : 6
Output : 6 is a Perfect number              */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException {

		int sum=0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		for(int i=1; i<num; i++)
			if(num % i == 0)
				sum = sum + i;
		if(num == sum)		
			System.out.println(sum+" is a Perfect Number");
		else
			System.out.println(sum+" is not a Perfect Number");
	}
}
