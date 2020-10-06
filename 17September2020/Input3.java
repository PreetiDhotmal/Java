import java.io.*;

class IOExceptionDemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input1 = Integer.parseInt(br.readLine());
		int input2 = Integer.parseInt(br.readLine());

		System.out.println(input1+input2);
	}
}
