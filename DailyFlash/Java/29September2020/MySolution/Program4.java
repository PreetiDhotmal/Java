/* Take an array of elements {A,B,C,D,E} and print the following pattern
Output : A B C D E
	 B C D E
	 C D E
	 D E
	 E         */

class Program {

	public static void main(String[] args){

		char carr[] = {'A','B','C','D','E'};

		for(int i=0; i<5; i++){
			for(int j=i; j<5; j++)
				System.out.print(carr[j]+" ");
			System.out.println();
		}
	}
}
