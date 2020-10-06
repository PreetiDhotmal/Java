/* Write a program to rpint following pattern 

	A A A A
	B B B
	C C
	D            */

class Program {

	public static void main(String[] args){

		char ch = 'A';
		for(int i=4; i>=1; i--,ch++){

			for(int j=1; j<=i; j++)

				System.out.print(ch+" ");
			System.out.println();		
		}
	}
}
