/* Write a program and print the Average of all the number 
Input : 12345
Output : The Average of digit from number 12345 is 3
*/

class Program {

	public static void main(String[] args){

		int num = 12345;
		int rem = 0, sum = 0, count = 0;

		while(num!=0){
	
			rem = num % 10;
			sum = sum + rem;
			count = count + 1;
			num = num / 10;
		}
		System.out.println("The average of digit from number is "+sum/count);
	}
}
