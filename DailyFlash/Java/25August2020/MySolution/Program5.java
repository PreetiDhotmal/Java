/* Write a program to print following pattern

	0 0 0 0
	1 1 1 1
	0 0 0 0
	1 1 1 1
*/

class Program {

	public static void main(String[] args){

		for(int i=1; i<=4; i++){

			for(int j=1; j<=4; j++){

				if(i%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
