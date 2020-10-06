/* Take Information of 4 Students.(use of loop is compulsory)
Student info is :- StudentName(String), Grade(char), Age(int), and Marks(double) as Input from user and print it. use String tokenizer and print count of total numbers of token accepted from StringTokenizer and after use delimiters as follows
1) " ", 2)"," ,3)" : ", 3)"-"
for every loop iteration changes the delimiter */

import java.io.*;
import java.util.*;

class Program {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String array[] = {" ",",",":","-"};
		for(int i=0; i<4; i++){
			
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str,array[i]);

			int count=0;

			for(int j=1; j<=4; j++){

				String token = st.nextToken().trim();
				count++;
			}
			System.out.println(count);
		}
	}
}
