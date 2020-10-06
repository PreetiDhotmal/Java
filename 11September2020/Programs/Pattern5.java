/*
	1 A 2 B
	3 C 4
	5 D
	6
*/

class Pattern{

	public static void main(String[] args){

		int num = 1;
		char ch = 'A';

		for(int i=1; i<=4; i++){

			for(int j=4; j>=i; j--){

				if(j == 2 || j == 4){
					System.out.print(num+" ");
					num++;				
				}else{
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
