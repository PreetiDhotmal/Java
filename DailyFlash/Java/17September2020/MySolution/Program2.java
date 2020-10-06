/*	1 2 3 4 5
	2 3 4 5 1
	3 4 5 1 2
	4 5 1 2 3
	5 1 2 3 4  */

class Pattern{

	public static void main(String[] args){

		for(int i=1; i<=5; i++){

			int num=i;
			for(int j=1; j<=5; j++){

				if(num>5)
					num=1;
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
