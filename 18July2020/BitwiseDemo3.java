class BitwiseDemo{

	public static void main(String[] args){

		int x = 9;	//0000 0000 0000 1001
		int y = 10;	//0000 0000 0000 1010
		int ans = 0;

		ans = x ^ y;	//0000 0000 0000 0011

		System.out.println("Ans = " + ans);	//3
	}
}
