/* Write a program to print following pattern

	7
	7 6
	6 5 4
	4 3 2 1           */

class Program {

	public static void main(String[] args){

		for(int i=1,num=7; i<=4; i++,num++){

			for(int j=1; j<=i; j++,num--){

				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
