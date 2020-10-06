/* Write a program to print following pattern

	1 2 3 4  5
	  4 6 8  10
	    9 12 15
	      16 20
		 25           */

class Pattern {

	public static void main(String[] args){

		for(int i=1; i<=5; i++){

			int val=i;
			for(int k=1; k<i; k++)
				System.out.print("  ");
			for(int j=5; j>=i; j--){
				System.out.print(val*i+" ");
				val++;
			}
			System.out.println();
		}	
	}
}
