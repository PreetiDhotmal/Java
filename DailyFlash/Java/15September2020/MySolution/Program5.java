/* Write a program to print following pattern

	1 2 3 4 5
	3 4 5 6
	5 6 7
	7 8
	9                */

class Pattern {

	public static void main(String[] args){

		int val=0;
		for(int i=1; i<=5; i++){
			int num = val + i;
			for(int j=5; j>=i; j--){
				System.out.print(num+" ");
				num++;}
			val++;
			System.out.println();
		}
	}
}
