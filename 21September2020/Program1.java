import java.io.*;

class ConnectionBuffer {

	public static void main(String[] args)throws IOException{

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(br1.readLine());
		System.out.println(br1.readLine());

		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(br2.readLine());

		br1.close();
	}
}
