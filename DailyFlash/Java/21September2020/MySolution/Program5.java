/* Write a java program that accepts 2 number as command line arguments and prints the summation of those two numbers
Input : java Demo 5 7
Output : The sum of 5 & 7 is 12   */

class Program {

	public static void main(String[] args){

		System.out.println("The sum is = "+(args[0]+args[1]));	//command line values are strings they can't add 
	}
}
