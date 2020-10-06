/* take an array element {A,B,C,D,E} and convert into lower case letter and print it */

class Program {

	public static void main(String[] args){

		char carr[] = {'A','B','C','D','E'};
		System.out.print("elements in lower case = ");
		for(int i=0; i<5; i++)
			System.out.print((char)(carr[i]+32)+" ");
		System.out.println();
	}
}
