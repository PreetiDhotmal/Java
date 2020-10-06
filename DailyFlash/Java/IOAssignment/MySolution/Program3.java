import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	
		System.out.print("Enetr number : ");		
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);

		System.out.print("Enetr number : ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		System.out.println("Addition = "+(num1+num2));	
		System.out.println("Substraction = "+(num1-num2));
		System.out.println("Multiplication = "+(num1*num2));
		System.out.println("Division = "+(num1/num2));						
	}
}
