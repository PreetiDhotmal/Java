import java.io.*;

class ConnectionBuffer {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter two numbers ");
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("Addition = "+(a+b));
		System.out.println("Substraction = "+(a-b));
		System.out.println("Divition = "+(a/b));
		System.out.println("Multiplication = "+(a*b));
	}
}
