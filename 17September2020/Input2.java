import java.io.*;

class IOExceptionDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		System.out.println(input1);

		String input2 = br.readLine();
		System.out.println(input2);

		br.close();

		String input3 = br.readLine();
		System.out.println(input3);
	}
}
