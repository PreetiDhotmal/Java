class OperatorsDemo{

	public static void main(String[] args){

		int x = 20;

		x >>>= 2;
		System.out.println("Ans = "+ x);	//

		x <<= 3;
		System.out.println("Ans = "+ x);	//0000 0000 0010 1000

		x ^= 2;
		System.out.println("Ans = "+ x);	//

		x = ++x;
		System.out.println("Ans = "+ x);	//

		x = ~x;
		System.out.println("Ans = "+ x);	//

	}
}
