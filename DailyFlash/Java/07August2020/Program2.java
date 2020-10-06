/*Write a program and print addition of even digits and multiplication of add digit from number
Input : 12345
Output : Addition of even digit : 6
Multiplication of add digit : 15
*/

class Program{

	public static void main(String[] args){

		int num = 12345;
		int rem=0, sum=0, mul=1;
		while(num!=0){

			rem = num % 10;
			if(rem % 2 == 0)
				sum = sum + rem;
			else
				mul = mul * rem;
			num = num / 10;
		}
		System.out.println("Addition of even digit = "+sum);
		System.out.println("Multiplication of odd digit = "+mul);
	}
}
