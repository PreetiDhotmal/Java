import java.io.*;

class Program{

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enetr character = ");
		char ch = (char)br.read();
		System.out.println(ch);

		
		System.out.print("Enetr integer number = ");
		String line1 = br.readLine();		
		int i = (int)br.read();
		System.out.println(i);

		System.out.print("Enetr float number = ");
		String line2 = br.readLine();
		float f = Float.parsefloat();
		System.out.println(f);
	
		System.out.print("Enetr double number = ");
		String line3 = br.readLine();
		double d = (double)br.read();
		System.out.println(d);
	}
}
