/* Write java code to print following pattern

	2
	5 10
	17 26 37
	50 65 82 101   */

class Pattern {

	public static void main(String[] args){

		int num=3;
		int val=2;
		for(int i=1; i<=4; i++){

			for(int j=1; j<=i; j++){
				System.out.print(val+" ");
				val = val + num;
				num+=2;
			}
			System.out.println();
		}
	}
}
