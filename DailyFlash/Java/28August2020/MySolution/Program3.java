/* Write a program to print following pattern

	1
	2 3
	4 5 6
	7 8 9 10
*/

class Program{

	public static void main(String[] args){

		for(int i=1,x=1; i<=4; i++){

			for(int j=1; j<=i; j++,x++)
				System.out.print(x+" ");
			System.out.println();
		}
	}
}
