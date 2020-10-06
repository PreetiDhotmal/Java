import java.io.*;

class UserInput {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no of element : ");
		int x = Integer.parseInt(br.readLine());

		int[] iarr = new int[x];

		for(int i=0; i<x; i++){
			
			System.out.print("Enter element : ");
			iarr[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("");
		for(int i=0; i<x; i++)
			if(iarr[i] % 5 == 0)
				System.out.println(iarr[i]+" divisible by 5");
			else
				System.out.println(iarr[i]+" not divisible by 5");
	}
}
