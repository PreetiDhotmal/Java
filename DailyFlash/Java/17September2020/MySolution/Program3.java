/*	1 1 1 1 1
	2 2
	3 3
	4 4
	5 5 5 5 5 */

class Pattern {

	public static void main(String[] args){

		for(int i=1; i<=5; i++){

			for(int j=1; j<=5; j++){

				if(i==1 || i==5)
					System.out.print(i+" ");
				else
					if(j==1 || j==2)
						System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
