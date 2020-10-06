/* Write a program to print following pattern
	 25
      16 25
    9 16 25
  4 9 16 25
1 4 9 16 25        */

class Pattern {

	public static void main(String[] args){

		for(int i=1; i<=5; i++){

			int num=1;
			for(int j=5; j>i; j--){
				System.out.print("  ");
				num++;
			}
			for(int k=1; k<=i; k++){
				System.out.print(num*num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
