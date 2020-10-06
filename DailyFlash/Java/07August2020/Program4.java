/* Write a program and print maximum digit from that number
Input : 123457798
Output : The maximum digit from number 123457798 is 9
*/
 
class Program{

	public static void main(String[] args){

		int num = 12357798;
		int rem=0, max=0;
		while(num!=0){
		
			rem = num % 10;
			num = num / 10;
			if(rem > max)
				max = rem;
		}
		System.out.println("The maximum digit from number is "+max);
	}
}
