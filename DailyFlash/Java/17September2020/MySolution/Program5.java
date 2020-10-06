/*	A B C D E F
	A B C D E
	A B C D
	A B C
	A B
	A
	A
	A B
	A B C
	A B C D
	A B C D E
	A B C D E F  */

class Pattern{

	public static void main(String[] args){

		for(int i=1; i<=11; i++){
			char ch = 'A';
			if(i<6)
				for(int j=6; j>=i; j--){
					System.out.print(ch+" ");
					ch++;
				}
			else
				for(int j=6; j<=i; j++){
					System.out.print(ch+" ");
					ch++;
				}
			System.out.println();
		}
	}
}
