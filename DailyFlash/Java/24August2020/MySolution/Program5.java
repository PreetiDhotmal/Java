/* Write a program to print following pattern

	0 0 0 0
	0 0 0 0
	0 0 0 0
	0 0 0 0
*/

class Program {

	public static void main(String[] args){

		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++)
				System.out.print("0 ");
			System.out.println();
			}
	}
}
