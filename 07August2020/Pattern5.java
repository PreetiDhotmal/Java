/*
	0  3  8
	15 24 35
	48 63 80
*/

class NestedForDemo {

	public static void main(String[] args){

		int num1 = 0;
		int num2 = 2;

		for(int i=1; i<=3; i++){

			for(int j=1; j<=3; j++){

				System.out.print(num1*num2+" ");
				num1++;
				num2++;
			}
			System.out.println();
		}
	}
}
