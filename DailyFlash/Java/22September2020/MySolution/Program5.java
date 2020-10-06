/* Take the rows as input and print following pattern
Input : 5
Output : 	1
	       2 2
	      3 3 3
	     4 4 4 4
	    5 5 5 5 5   */

import java.io.*;

class Program {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows = ");
		String s1 = br.readLine();
		int num = Integer.parseInt(s1);

		for(int row=1; row<=num; row++){

			for(int space=num; space>row; space--)
				System.out.print(" ");

			for(int col=1; col<=row; col++)
				System.out.print(row+" ");
			System.out.println();
		}		
	}
}
