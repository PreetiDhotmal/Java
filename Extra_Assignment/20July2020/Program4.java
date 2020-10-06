class NotOperator{

	public static void main(String[] args){

		int a = 10;
		long b = 2000;
		float c = 10.5f;
		double d = 20.0000d;
		char ch = 'A';


		System.out.println("Ans = "+(~a));	//-11

		System.out.println("Ans = "+(~b));	//-2001

		//System.out.println("Ans = "+(~c));	//we can't use ~ on float value

		//System.out.println("Ans = "+(~d));	//we can't use ~ on double value

		System.out.println("Ans = "+(~ch));	//-66
	}
}
