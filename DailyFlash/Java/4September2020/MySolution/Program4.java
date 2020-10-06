/* Write a program to print following pattern 

	3
	2 3
	1 2 3
	0 1 2 3          */

class Program {

	public static void main(String[] args){

		for(int i=3; i>=0; i--){
			int x = i;
			for(int j=3; j>=i; j--,x++)
				System.out.print(x+" ");
			System.out.println();
		}
	}
}
