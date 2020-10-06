/* Student.
Student info is :-
 
Take StudentName(String),Grade(char),Age(int), and Marks(double) as input from user and print it. use StringTokenizer handle empty space for E.g :-
Input from keyboard is :- ABRAR, B, 23, 21.34 */

import java.io.*;
import java.util.*;

class Program {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str,",");

		String token1 = st.nextToken().trim();
		String token2 = st.nextToken().trim();
		String token3 = st.nextToken().trim();
		String token4 = st.nextToken().trim();

		int age = Integer.parseInt(token3);
		double marks = Double.parseDouble(token4);

		System.out.println("Name = "+token1);
		System.out.println("Grade = "+token2);
		System.out.println("Age = "+token3);
		System.out.println("Marks = "+token4);		
	}
}
