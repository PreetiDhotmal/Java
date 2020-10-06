/* Write a program to print following pattern

	a
	A A
	a a a
	A A A A
	a a a a a       */

class Program {

	public static void main(String[] args){

		for(int i=1; i<=5; i++){

			for(int j=1; j<=i; j++){
				if(i % 2 == 0)
					System.out.print("A ");
				else
					System.out.print("a ");
			}
			System.out.println();
		}
	}
}
