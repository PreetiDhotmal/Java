/* Write java code for following pattern

	A B C D
	  A B C
	    A B
	      A    */

class Pattern {

	public static void main(String[] args){

		for(int i=1; i<=4; i++){
			char ch='A';
			for(int k=1; k<i; k++)
				System.out.print("  ");
			for(int j=4; j>=i; j--){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
