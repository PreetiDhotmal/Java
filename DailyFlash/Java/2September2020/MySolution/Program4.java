/* Write a program to print following pattern

	1
	4  9
	16 25 36
	49 64 81 100            */

class Program {

	public static void main(String[] args){

		for(int i=1,x=1; i<=4; i++){

			for(int j=1; j<=i; j++,x++)
				
				if(x<4)
					System.out.print((x*x)+"  ");
				else
					System.out.print((x*x)+" ");
			System.out.println();
		}
	}
}
