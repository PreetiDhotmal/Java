/* Write a program to check whether the number is divisible by 5 & 11 or not 
Input : 55
Output : 55 is divisible by 5 & 11
*/

class Program {

	public static void main(String[] args){

		int num = 55;
		if(num % 5 == 0 && num % 11 == 0)
			System.out.println(num+" is divisible by 5 & 11");
		else
			System.out.println(num+" is not divisible by 5 & 11");
	}
}
