/* Write a program using while loop to print first 10 numbers which are divisible by 32 and 7 (break loop if any number is divisible by 32 and 7 is also divisible by 6)
Input : -
Output : 224 448
	breaking loop
*/

class Program {

	public static void main(String[] args){

		int num = 1;		
		while(num!=0){

			if(num % 32 == 0 && num % 7 == 0 && num % 6 == 0){

				System.out.println("Breaking loop");
				break;

			}else if(num % 32 == 0 && num % 7 == 0){

				System.out.println(num);
	
			}
			num++;
		}
	}
}
