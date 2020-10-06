import java.io.*;

class ArrayDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of planes = ");
		int plane = Integer.parseInt(br.readLine());

		System.out.print("Enter number of rows = ");
		int rows = Integer.parseInt(br.readLine());

		System.out.print("Enter number of cos = ");
		int cols = Integer.parseInt(br.readLine());

		int marr[][][] = new int[plane][rows][cols];

		for(int i=0; i<plane; i++){

			for(int j=0; j<rows; j++){

				for(int k=0; k<cols; k++){

					marr[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}

		
		for(int i=0; i<plane; i++){

			System.out.println(i + " plane is = ");

			for(int j=0; j<rows; j++){

				for(int k=0; k<cols; k++){

					System.out.print(marr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}
}
