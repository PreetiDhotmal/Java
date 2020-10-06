/* Write java code for print following pattern

	= = = =
	= = =
	= =
	=
	*
	* *
	* * *
	* * * *   */
class Pattern {

	public static void main(String[] args){

		for(int i=1; i<=8; i++){

			for(int j=1; j<=4; j++)
				if(i+j>=6 && i-j<=3)
					System.out.print("  ");
				else
					if(i<=4)
						System.out.print("= ");
					else
						System.out.print("* ");
			System.out.println();
		}
	}
}
