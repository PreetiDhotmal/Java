/*
	1
	2 3
	4 5 6
	7 8 9 10
*/

class Pattern {

	public static void main(String[] args){

		for(int i=1, num=1; i<=4; i++){

			for(int j=1; j<=i; j++,num++)
				System.out.print(num+" ");
			System.out.println();
		}
	}
}
