/* Write a program to print following pattern

	1  2  3  4
	5  5  6  7
	8  9  10 11
	12 13 14 15
*/

class Program {

	public static void main(String[] args){

		int num=1;
		for(int i=1; i<=4; i++){

			for(int j=1; j<=4; j++,num++){
		
				if(num<10)
					System.out.print(num+"  ");
				else
					System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}
