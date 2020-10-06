/*
	A
      B B
    C C C
  D D D D

*/

class PatternDemo{

	public static void main(String[] args){

		char ch='A';
		for(int row=1; row<=4; row++){

			for(int space=4; space>row; space--){

				System.out.print("  ");
			}
			for(int col=1; col<=row; col++){

				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}
}
