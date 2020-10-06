/*Write a program to print following pattern

	1 1 1 1
	1 1 1 1
	1 1 1 1
	1 1 1 1
*/

class Program{

	public static void main(String[] args){

		for(int i=1; i<=4; i++){

			for(int j=1; j<=4; j++){

				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
