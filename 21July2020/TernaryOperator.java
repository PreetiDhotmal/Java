class TernaryOperator{

	public static void main(String[] args){

		int x = 25;
		int y = 20;
		int res;
	
		res = (x < y) ? x : y;		//(25 < 20) ? No y = 20
		System.out.println(res);	//20
	}
}
