import java.io.*;
	
class Program {

	public static void main(String[] args) throws IOException{

		int ans1,ans2;
		int ans3;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enetr number 1 = ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Enetr number 2 = ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.print("Enetr number 3 = ");
		String s3 = br.readLine();
		int num3 = Integer.parseInt(s3);

		ans1 = (num1 < num2)? num1 : (num2<num3)? num2 : num3;
		ans2 = (num1 > num2)? num1 : (num2>num3)? num2 : num3;
		if(ans1!=num1 && ans2!=num1)
			ans3=num1;
		else if(ans1!=num2 && ans2!=num2)
			ans3=num2;
		else if(ans1!=num3 && ans2!=num3)
			ans3=num3;
		System.out.println("Ascending = "+ans1+" "+ans3+" "+ans2);
		System.out.println("Descending = "+ans2+" "+ans3+" "+ans1);
	}
}
