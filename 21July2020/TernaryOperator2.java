class TernaryDemo{

	public static void main(String[] args){

		int x = 25;
		int y = 20;
		int z = 22;

		int ans = 0;
	
		ans = (x > y) ? ((x > y) ? x : z) : ((y > z) ? y : z);

		System.out.println(ans);
	}
}
