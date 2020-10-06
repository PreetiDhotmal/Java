/* Write a program to print first 50 even number 
Output : 2 4 6 ... 100 */

class Program {

	public static void main(String[] args){

		for(int i=1; i<=100; i++)
			if(i % 2 == 0)
				System.out.print(i+" ");
		System.out.println();
	}
}
