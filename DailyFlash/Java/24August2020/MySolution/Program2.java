/* Write a program to print sum of first 10 natural numbers
Output : The sum of first 10 natural number : 55 */

class Program {

	public static void main(String[] args){

		int sum = 0;

		for(int i=1; i<=10; i++)
			sum = sum + i;
		System.out.println("The sum of first 10 natural numbers : "+sum);
	}
}
