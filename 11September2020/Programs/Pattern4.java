/*

*/

class Pattern{

	public static void main(String[] args){

		int num = 1;
		char ch = '@';

		for(int i=1; i<=4; i++){

			for(int j=4; j>=i; j--){

				if(j == 2 || j == 4)
					System.out.print(num+" ");			
				else
					System.out.print(ch+" ");
				ch++;
				num++;
			}
			System.out.println();
		}
	}
}
