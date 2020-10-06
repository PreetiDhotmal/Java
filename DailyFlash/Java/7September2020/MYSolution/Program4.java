/* Write a program to print following pattern

	7
	7 6
	6 5 4
	4 3 2 1           */

class Program {

	public static void main(String[] args){

		int val=7;
		for(int i=1; i<=4; i++){
			
			for(int j=1; j<=i; j++){
					
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
			val++;
		}
	}
}
