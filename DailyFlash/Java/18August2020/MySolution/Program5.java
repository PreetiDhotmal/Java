/* Write a program to find maximum between three numbers
Input : 1 4 2
Output : 4 is max number among 1, 4 & 2
*/

class Program {

	public static void main(String[] args){

		int num1 = 1, num2 = 4, num3 = 2, ans;

		ans = (num1 > num2)? num1 : (num2 > num3)? num2 : num3;
		System.out.println(ans+" is max number among "+num1+", "+num2+" & "+num3);
	}
}
