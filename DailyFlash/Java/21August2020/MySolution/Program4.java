/* Write a program to print following pattern

	2 4 6 8
	2 4 6 8
	2 4 6 8
	2 4 6 8
*/

class Program{
		
	public static void main(String[] args){

		for(int i=1; i<=4; i++){
	
			for(int j=1; j<=4; j++){
	
				System.out.print(j*2+" ");
			}
			System.out.println();
		}
	}
}
