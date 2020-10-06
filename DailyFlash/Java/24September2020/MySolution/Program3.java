/* Take Information of 3 Students(use any loop) Students info is :-

StudentName(String), Grade(char), Age(int) and Marks(double) as Input from user and print it. use StringTokenizer, deliminater is " ". */

import java.io.*;
import java.util.*;

class Program {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for(int i=1; i<=3; i++){

			System.out.println("Enter "+i+" student information");
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
		
			String token1 = st.nextToken().trim();
			String token2 = st.nextToken().trim();
			String token3 = st.nextToken().trim();
			String token4 = st.nextToken().trim();

			System.out.println("Name = "+token1);
			System.out.println("Grade = "+token2);
			System.out.println("Age = "+token3);
			System.out.println("Marks = "+token4);
		}		
	}
}
