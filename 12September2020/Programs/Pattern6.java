/*
		=
	      * * *
	    = = = = =
	  * * * * * * *
	= = = = = = = = =
*/

class PatternDemo{

	public static void main(String[] args){

		char ch='A';
		for(int row=1; row<=5; row++){

			for(int space=4; space>=row; space--)
				System.out.print("  ");
			for(int col=1; col<=row*2-1; col++)
				if(row % 2 == 0)
					System.out.print("* ");
				else
					System.out.print("= ");
			System.out.println();
			ch++;
		}
	}
}
