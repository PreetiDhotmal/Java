import java.io.*;

class InputDemo{

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String input = br.readLine();
		System.out.println(input);		
	}
}
