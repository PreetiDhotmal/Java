import java.io.*;
import java.util.*;

class TokenDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String empDetail = br.readLine();
		
		StringTokenizer st = new StringTokenizer(empDetail," ");

		String token1 = st.nextToken().trim();
		String token2 = st.nextToken().trim();
		String token3 = st.nextToken().trim();
		
		int empID = Integer.parseInt(token1);
		float empSal = Float.parseFloat(token3);

		System.out.println("Empid = "+empID);
		System.out.println("Empname = "+token2);
		System.out.println("Empsalary = "+empSal);
	}
}
