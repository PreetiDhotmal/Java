class BitwiseDemo{

	public static void main(String[] args){

		int x = 24;	//0000 0000 0001 1000
		int y = 10;	//0000 0000 0000 1010

		int ans = 0;

		ans = x | y;	//0000 0000 0001 1010

		System.out.println("Ans = "+ans);	//26
	}
}
