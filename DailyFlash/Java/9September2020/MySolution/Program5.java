/* Write a program that calculates the greatest common divisor of two entered number
Input : 25 15
Output : The GCD of 25 & 15 is 5		*/

import java.io.*;

class Program{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int gcd = 1;

		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		for(int i=1; i<=num1 && i<=num2; ++i){

			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
	}
}

/*

public class GCD {

    public static void main(String[] args) {

        int n1 = 81, n2 = 153, gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers

		if(n1 % i==0 && n2 % i==0)
			gcd = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    }
}

*/
