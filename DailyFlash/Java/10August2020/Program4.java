/* Write a java program to take a number as input and print series of factorials of numbers ranging up to that number from 1
Input : 10
Output : Factorial of 1 : 1 factorial of 2 : 2....
*/

class Program {

	public static void main(String[] args){
		
		int fact = 1;
		for(int i=1; i<=10; i++){

			fact = fact * i;
			System.out.println("Factorial = "+fact);
		}
	}
}
