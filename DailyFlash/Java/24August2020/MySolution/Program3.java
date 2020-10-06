/* Write a program to print first 50  odd number 
Output : 1 3 5 ... 99 */

class Program {

	public static void main(String[] args){

		for(int i=1; i<=100; i++)
			if(i % 2 != 0)
				System.out.print(i+" ");
		System.out.println();
	}
}
