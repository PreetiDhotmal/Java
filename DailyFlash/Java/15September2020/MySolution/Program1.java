/* Write a program to print following pattern
	A
      B C
    C D E
  D E F G
E F G H I            */

class Pattern{

	public static void main(String[] args){

		for(int i=1; i<=5; i++){
		
			int ch = 64 + i;
			for(int j=4; j>=i; j--)
				System.out.print("  ");
			for(int k=1; k<=i; k++){
				char c = (char)ch;
				System.out.print(c+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
