/*
Find the number is even or odd using ternary operator
input : 10
output : 10 is even
*/

class TernaryOperator{

	public static void main(String[] args){

		int num = 10;
		String res = null;

		res = (num % 2 == 0) ? "10 is even" : "10 is odd";
		System.out.println(res);
		
	}
}
