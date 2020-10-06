import java.io.*;

class Program {

	public static void main(String[] args) throws IOException{

		String prime = "";

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter starting number = ");
		String s1 = br.readLine();
		int num1 = Integer.parseInt(s1);
		
		System.out.print("Enter ending number = ");
		String s2 = br.readLine();
		int num2 = Integer.parseInt(s2);

		for(int i=num1; i<num2; i++){

			int count = 0;
			for(int num = i; num>=1; num--){

				if(i%num==0)
					count++;
			}
			if(count == 2)
				prime = prime+i+" ";
		}
		System.out.println(prime);
	}
}
